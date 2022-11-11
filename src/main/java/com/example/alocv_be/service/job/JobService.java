package com.example.alocv_be.service.job;

import com.example.alocv_be.model.Job;
import com.example.alocv_be.repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService implements IJobService {

    @Autowired
    private IJobRepo jobRepo;

    @Override
    public Iterable<Job> findAll(Pageable pageable) {
        return jobRepo.findAll();
    }

    @Override
    public Optional<Job> findById(Long id) {
        return jobRepo.findById(id);
    }

    @Override
    public Job save(Job job) {
        return jobRepo.save(job);
    }

    @Override
    public void remove(Long id) {
    jobRepo.deleteById(id);
    }


    @Override
    public List<Job> findJobBy(String name, Long salaryRange_min, Long salaryRange_max, String jobField, String location, String company) {
        List<Job> jobList= jobRepo.findJobBy(name,salaryRange_min,salaryRange_max,jobField, location, company);
        return jobList;
    }

    @Override
    public List<Job> findJobByLocationId(Long id) {
        return jobRepo.findJobByLocationId(id);
    }

    @Override
    public List<Job> findJobByCompanyIdAndStatusIsTrue(Long id) {
        return jobRepo.findJobByCompanyIdAndStatusIsTrue(id);
    }
    public List<Job> findJobByJobFieldId(Long id){
        return jobRepo.findJobByJobFieldId(id);
    }
    public List<Job> findAllByIdAndStatus(Pageable pageable, Long id,boolean status) {
        return jobRepo.findAllByIdAndStatus(pageable,id, status);
    }
    @Override
    public List<Job> findJobByUserId(Long id) {
        return jobRepo.findJobByUserId(id);
    }

//    @Override
//    public List<Job> findJobBy(String name, Long salaryRange, String jobField, String location, String company) {
//        return null;
//    }

}
