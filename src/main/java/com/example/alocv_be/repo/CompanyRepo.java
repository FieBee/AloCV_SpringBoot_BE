package com.example.alocv_be.repo;

import com.example.alocv_be.model.entity.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends PagingAndSortingRepository<Company, Long> {
}
