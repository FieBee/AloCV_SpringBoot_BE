package com.example.alocv_be.controller;

import com.example.alocv_be.model.entity.Job;
import com.example.alocv_be.model.entity.JobData;
import com.example.alocv_be.model.entity.User;
import com.example.alocv_be.service.job.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
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

    @GetMapping("/{id}")
    public ResponseEntity<Job> findJobById(@PathVariable Long id) {
        Optional<Job> job = jobService.findById(id);
        if (!job.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(job.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Job> saveJob(@RequestBody Job job) {
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
        jobService.remove(id);
        return new ResponseEntity<>(jobOptional.get(), HttpStatus.NO_CONTENT);
    }
    @GetMapping("/getJob/{name}/{salaryRange}/{jobField}/{location}/{companyName}")
    public ResponseEntity<List<Job>> findBy(@PathVariable String name, @PathVariable  Long salaryRange, @PathVariable  String jobField, @PathVariable String location, @PathVariable String companyName) {
        List<Job> jobList = jobService.findJobByNameAndSalaryRangeAndJobFieldAndLocation(name, salaryRange,jobField,location, companyName);
        if (jobList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        System.out.println(jobList);
        return new ResponseEntity<>(jobList, HttpStatus.OK);
    }
}
