package com.example.alocv_be.repo;

import com.example.alocv_be.model.entity.Account;
import com.example.alocv_be.model.entity.Job;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IJobRepo extends PagingAndSortingRepository<Job, Long> {
}
