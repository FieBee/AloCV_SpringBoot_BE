package com.example.alocv_be.repo;

import com.example.alocv_be.model.entity.JobField;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobFieldRepo extends PagingAndSortingRepository<JobField, Long> {
}
