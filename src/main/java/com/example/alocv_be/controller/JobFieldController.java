package com.example.alocv_be.controller;

import com.example.alocv_be.model.JobField;
import com.example.alocv_be.service.jobField.IJobFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/jobfields")
public class JobFieldController {
    @Autowired
    private IJobFieldService jobFieldService;
    @GetMapping
    public ResponseEntity<Iterable<JobField>> findAllJobField(Pageable pageable){
        List<JobField> jobFields = (List<JobField>) jobFieldService.findAll(pageable);
        if (jobFields.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(jobFields, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<JobField> findJobFieldById(@PathVariable Long id){
        Optional<JobField> jobFieldOptional = jobFieldService.findById(id);
        if (!jobFieldOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(jobFieldOptional.get(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<JobField> saveJobField(@RequestBody JobField jobField){
        return new ResponseEntity<>(jobFieldService.save(jobField), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<JobField> updateJobField(@PathVariable Long id, @RequestBody JobField jobField){
        Optional<JobField> jobFieldOptional = jobFieldService.findById(id);
        if (!jobFieldOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        jobField.setId(jobFieldOptional.get().getId());
        return new ResponseEntity<>(jobFieldService.save(jobField), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<JobField> deleteJobField(@PathVariable Long id){
        Optional<JobField> jobFieldOptional = jobFieldService.findById(id);
        if (!jobFieldOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        jobFieldService.remove(id);
        return new ResponseEntity<>(jobFieldOptional.get(), HttpStatus.NO_CONTENT);
    }
}
