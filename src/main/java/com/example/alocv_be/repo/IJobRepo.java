package com.example.alocv_be.repo;

import com.example.alocv_be.model.entity.Account;
import com.example.alocv_be.model.entity.Job;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobRepo extends PagingAndSortingRepository<Job, Long> {
}
