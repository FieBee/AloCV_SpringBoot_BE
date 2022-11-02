package com.example.alocv_be.service.company;

import com.example.alocv_be.model.entity.Company;
import com.example.alocv_be.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CompanyService implements ICompanyService{
    @Autowired
    CompanyRepo companyRepo;

    @Override
    public Iterable<Company> findAll() {
        return companyRepo.findAll();
    }

    @Override
    public Optional<Company> findById(Long id) {
        return companyRepo.findById(id);
    }

    @Override
    public Company save(Company company) {
        return companyRepo.save(company);
    }

    @Override
    public void remove(Long id) {
        companyRepo.deleteById(id);
    }
}
