package com.example.alocv_be.service.location;

import com.example.alocv_be.model.entity.Location;
import com.example.alocv_be.repo.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService implements ILocationService{
    @Autowired
    private LocationRepo locationRepo;

    @Override
    public Iterable<Location> findAll(Pageable pageable) {
        return locationRepo.findAll();
    }

    @Override
    public Optional<Location> findById(Long id) {
        return locationRepo.findById(id);
    }

    @Override
    public Location save(Location location) {
        return locationRepo.save(location);
    }

    @Override
    public void remove(Long id) {
        locationRepo.deleteById(id);
    }
}
