package com.example.alocv_be.controller;

import com.example.alocv_be.model.Job;
import com.example.alocv_be.service.job.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/job")
public class JobAllController {

    @Autowired
    private IJobService jobService;

    @GetMapping
    public ResponseEntity<Iterable<Job>> findAllJob(Pageable pageable) {
        List<Job> jobs = (List<Job>) jobService.findAll(pageable);
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<Iterable<Job>> findAll() {
        List<Job> jobs = jobService.findAllJob();
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> findJobById(@PathVariable Long id) {
        Optional<Job> job = jobService.findById(id);
        if (!job.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(job.get(), HttpStatus.OK);
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<Iterable<Job>> findJobByCompanyId(@PathVariable Long id) {
        List<Job> jobs = jobService.findJobByCompanyIdAndStatusIsTrue(id);
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<Iterable<Job>> findJobByLocationId(@PathVariable Long id) {
        List<Job> jobs = jobService.findJobByLocationId(id);
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }
    @GetMapping("/jobField/{id}")
    public ResponseEntity<Iterable<Job>> findJobByJobFieldId(@PathVariable Long id){
        List<Job> jobs =jobService.findJobByJobFieldId(id);
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(jobs,HttpStatus.OK);

        }

    @PostMapping
    public ResponseEntity<Job> saveJob(@RequestBody Job job) {
        job.setStatus(true);
            return new ResponseEntity<>(jobService.save(job), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Job> updateJob(@PathVariable Long id, @RequestBody Job job) {
        Optional<Job> jobOptional = jobService.findById(id);
        if (!jobOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        job.setId(jobOptional.get().getId());
        return new ResponseEntity<>(jobService.save(job), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Job> deleteJob(@PathVariable Long id) {
        Optional<Job> jobOptional = jobService.findById(id);
        if (!jobOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        jobOptional.get().setStatus(false);
        jobService.save(jobOptional.get());
//        jobService.remove(id);
        return new ResponseEntity<>(jobOptional.get(), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/unlock/{id}")
    public ResponseEntity<Job> unlockJob(@PathVariable Long id) {
        Optional<Job> jobOptional = jobService.findById(id);
        if (!jobOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        jobOptional.get().setStatus(true);
        jobService.save(jobOptional.get());
        return new ResponseEntity<>(jobOptional.get(), HttpStatus.NO_CONTENT);
    }

 @GetMapping("/search")
    public ResponseEntity<List<Job>> findBy2(@RequestParam(value = "name", required = false) String name,
                                             @RequestParam(value = "salaryRange_min",required = false, defaultValue = "0") Long salaryRange_min,
                                             @RequestParam(value = "salaryRange_max",required = false, defaultValue = "1000000000") Long salaryRange_max,
                                             @RequestParam(value = "jobField",required = false) String jobField,
                                             @RequestParam(value = "location",required = false) String location,
                                             @RequestParam(value = "company",required = false) String company) {
        List<Job> jobList = jobService.findJobBy(name, salaryRange_min,salaryRange_max,jobField, location, company );
        if (jobList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        System.out.println(jobList);
        return new ResponseEntity<>(jobList, HttpStatus.OK);
    }


    @GetMapping("/searchByUserId/{id}")
    public ResponseEntity<List<Job>> findByUserId(@PathVariable Long id){
        List<Job> jobs = jobService.findJobByUserId(id);
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }
    @GetMapping("/findByUserId/{id}")
    public ResponseEntity<List<Job>> findJobByUserIdAndStatusIsTrue(@PathVariable Long id){
        List<Job> jobs = jobService.findJobByUserIdAndStatusIsTrue(id);
        if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }
    @DeleteMapping("/reverse/{id}")
    public ResponseEntity<Job> reverseSuggest(@PathVariable Long id) {
        Optional<Job> jobOptional = jobService.findById(id);
        if (!jobOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        jobOptional.get().setUser(null);
        jobService.save(jobOptional.get());
        return new ResponseEntity<>(jobOptional.get(), HttpStatus.NO_CONTENT);
    }

}
