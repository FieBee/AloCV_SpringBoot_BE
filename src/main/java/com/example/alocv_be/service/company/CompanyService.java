package com.example.alocv_be.service.company;

import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.Company;
import com.example.alocv_be.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CompanyService implements ICompanyService{
    @Autowired
    CompanyRepo companyRepo;

    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

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
    public Account remove(Long id) {
        companyRepo.deleteById(id);
        return null;
    }

    @Override
    public Optional<Company> findCompanyByAccount_UserName(String userName) {
        return companyRepo.findCompanyByAccount_UserName(userName);
    }


    @Override
    public List<Company> getAllCompany(Integer pageNo, Integer pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Company> pagedResult = companyRepo.findAllByStatusIsTrue(paging);
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Company>();
        }
    }

    @Override
    public List<Company> getCompanyBySuggestIsTrue() {
        return companyRepo.getCompanySuggest();
    }



}
