package com.example.alocv_be.service.job;

import com.example.alocv_be.model.Job;
import com.example.alocv_be.service.IGerenalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IJobService extends IGerenalService<Job> {
    List<Job> findJobByLocationId(Long id);
    List<Job> findJobByCompanyId(Long id);
    List<Job> findJobBy(String name, Long salaryRange, String jobField, String location, String company);
}
