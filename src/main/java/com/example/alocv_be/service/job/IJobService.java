package com.example.alocv_be.service.job;

import com.example.alocv_be.model.Job;
import com.example.alocv_be.service.IGerenalService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IJobService extends IGerenalService<Job> {
    List<Job> findAllJob();
    List<Job> findJobByLocationId(Long id);
    List<Job> findJobByCompanyIdAndStatusIsTrue(Long id);
    List<Job> findJobByJobFieldId(Long id);
    List <Job> findAllByIdAndStatus(Pageable pageable, Long id,boolean status);

    List<Job> findJobBy(String name, Long salaryRange_min, Long salaryRange_max, String jobField, String location, String company);

    List<Job> findJobByUserId(Long id);
    List<Job>findJobByUserIdAndStatusIsTrue(Long id);


}
