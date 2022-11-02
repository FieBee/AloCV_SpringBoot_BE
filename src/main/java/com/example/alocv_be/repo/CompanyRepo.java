package com.example.alocv_be.repo;

import com.example.alocv_be.model.entity.Company;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CompanyRepo extends PagingAndSortingRepository<Company, Long> {
}
