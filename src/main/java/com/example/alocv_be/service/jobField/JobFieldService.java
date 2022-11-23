package com.example.alocv_be.service.jobField;

import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.JobField;
import com.example.alocv_be.repo.JobFieldRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobFieldService implements IJobFieldService{
    @Autowired
    private JobFieldRepo jobFieldRepo;

    @Override
    public Iterable<JobField> findAll(Pageable pageable) {
        return jobFieldRepo.findAll();
    }

    @Override
    public Optional<JobField> findById(Long id) {
        return jobFieldRepo.findById(id);
    }

    @Override
    public JobField save(JobField jobField) {
        return jobFieldRepo.save(jobField);
    }

    @Override
    public Account remove(Long id) {
        jobFieldRepo.deleteById(id);
        return null;
    }
}
