package com.example.alocv_be.repo;

import com.example.alocv_be.model.CV;
import com.example.alocv_be.model.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepo extends PagingAndSortingRepository<Company, Long> {
    Optional<Company> findCompanyByAccount_UserName(String userName);
}
