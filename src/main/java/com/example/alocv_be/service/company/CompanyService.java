package com.example.alocv_be.service.company;

import com.example.alocv_be.model.entity.Company;
import com.example.alocv_be.model.entity.User;
import com.example.alocv_be.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CompanyService implements ICompanyService{
    @Autowired
    CompanyRepo companyRepo;

    @Override
    public Iterable<Company> findAll(Pageable pageable) {
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

    @Override
    public Optional<Company> findCompanyByAccount_UserName(String userName) {
        return companyRepo.findCompanyByAccount_UserName(userName);
    }
}
