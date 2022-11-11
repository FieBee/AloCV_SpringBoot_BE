package com.example.alocv_be.repo;

import com.example.alocv_be.model.CV;
import com.example.alocv_be.model.Job;
import com.example.alocv_be.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CVRepo extends PagingAndSortingRepository<CV, Long> {
    List<CV> findCVByUserId(Long id);

    List<CV> findCVByJobId(Long id);

}
