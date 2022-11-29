package com.example.alocv_be.controller;

import com.example.alocv_be.model.CV;
import com.example.alocv_be.service.cv.ICVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/cvs")
public class CVController {
    @Autowired
    private ICVService cvService;

    @GetMapping
    public ResponseEntity<Iterable<CV>> findAllCV(Pageable pageable) {
        List<CV> cvs = (List<CV>) cvService.findAll(pageable);
        if (cvs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cvs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CV> findCVById(@PathVariable Long id) {
        Optional<CV> cvOptional = cvService.findById(id);
        if (!cvOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cvOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<Iterable<CV>> findCVByUserIdAndStatusIsTrue(@PathVariable Long id) {
        List<CV> cvs = cvService.findCVByUserIdAndStatusIsTrue(id);
        if (cvs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cvs, HttpStatus.OK);
    }

    @GetMapping("/statusTrue/{id}")
    public ResponseEntity<Iterable<CV>> getCVByUserIdAndStatusIsTrue(@PathVariable Long id) {
        List<CV> cvs = cvService.findCVByUserIdAndStatusIsTrue(id);
        if (cvs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cvs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CV> saveCV(@RequestBody CV cv) {
        cv.setStatus(true);
        return new ResponseEntity<>(cvService.save(cv), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CV> updateCV(@PathVariable Long id, @RequestBody CV cv) {
        Optional<CV> cvOptional = cvService.findById(id);
        if (!cvOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cv.setId(cvOptional.get().getId());
        return new ResponseEntity<>(cvService.save(cv), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CV> deleteCV(@PathVariable Long id) {
        Optional<CV> cvOptional = cvService.findById(id);
        if (!cvOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cvService.remove(id);
        return new ResponseEntity<>(cvOptional.get(), HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Iterable<CV>> findCVByUserId(@PathVariable Long id) {
        List<CV> cvs = cvService.findCVByUserId(id);
        if (cvs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cvs, HttpStatus.OK);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Iterable<CV>> findCVByJobId(@PathVariable Long id) {
        List<CV> cvs = cvService.findCVByJobId(id);
        if (cvs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cvs, HttpStatus.OK);
    }

    @DeleteMapping("/status/{id}")
    public ResponseEntity<CV> deleteCVByStatus(@PathVariable Long id) {
        Optional<CV> cvOptional = cvService.findById(id);
        if (!cvOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cvOptional.get().setStatus(false);
        cvService.save(cvOptional.get());
//        jobService.remove(id);
        return new ResponseEntity<>(cvOptional.get(), HttpStatus.NO_CONTENT);
    }

}
