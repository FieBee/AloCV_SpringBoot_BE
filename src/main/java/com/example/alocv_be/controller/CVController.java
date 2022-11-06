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
    public ResponseEntity<Iterable<CV>> findAllCV(Pageable pageable){
        List<CV> cvs = (List<CV>) cvService.findAll(pageable);
        if (cvs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cvs, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CV> findCVById(@PathVariable Long id){
        Optional<CV> cvOptional = cvService.findById(id);
        if (!cvOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cvOptional.get(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<CV> saveCV(@RequestBody CV cv){
        return new ResponseEntity<>(cvService.save(cv), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<CV> updateCV(@PathVariable Long id, @RequestBody CV cv){
        Optional<CV> cvOptional = cvService.findById(id);
        if (!cvOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cv.setId(cvOptional.get().getId());
        return new ResponseEntity<>(cvService.save(cv), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<CV> deleteCV(@PathVariable Long id){
        Optional<CV> cvOptional = cvService.findById(id);
        if (!cvOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cvService.remove(id);
        return new ResponseEntity<>(cvOptional.get(), HttpStatus.NO_CONTENT);
    }
}
