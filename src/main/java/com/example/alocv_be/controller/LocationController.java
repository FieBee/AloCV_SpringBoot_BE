package com.example.alocv_be.controller;

import com.example.alocv_be.model.entity.Location;
import com.example.alocv_be.model.entity.Notification;
import com.example.alocv_be.service.location.ILocationService;
import com.example.alocv_be.service.notification.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    private ILocationService locationService;
    @GetMapping
    public ResponseEntity<Iterable<Location>> findAllLocation(Pageable pageable){
        List<Location> locations = (List<Location>) locationService.findAll(pageable);
        if (locations.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Location> findLocationById(@PathVariable Long id){
        Optional<Location> locationOptional = locationService.findById(id);
        if (!locationOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(locationOptional.get(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Location> saveLocation(@RequestBody Location location){
        return new ResponseEntity<>(locationService.save(location), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Location> updateLocation(@PathVariable Long id, @RequestBody Location location){
        Optional<Location> locationOptional = locationService.findById(id);
        if (!locationOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        location.setId(locationOptional.get().getId());
        return new ResponseEntity<>(locationService.save(location), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Location> deleteLocation(@PathVariable Long id){
        Optional<Location> locationOptional = locationService.findById(id);
        if (!locationOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        locationService.remove(id);
        return new ResponseEntity<>(locationOptional.get(), HttpStatus.NO_CONTENT);
    }
}
