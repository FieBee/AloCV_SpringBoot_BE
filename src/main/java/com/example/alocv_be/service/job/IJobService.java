package com.example.alocv_be.service.job;

import com.example.alocv_be.model.entity.Job;
import com.example.alocv_be.service.IGerenalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IJobService extends IGerenalService<Job> {
    List<Job> findJobByNameAndSalaryRangeAndJobFieldAndLocation(String name, Long salaryRange, String jobField, String location, String companyName);
}
