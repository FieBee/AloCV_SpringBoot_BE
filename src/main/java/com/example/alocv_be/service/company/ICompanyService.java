package com.example.alocv_be.service.company;

import com.example.alocv_be.model.Company;
import com.example.alocv_be.service.IGerenalService;

import java.util.List;
import java.util.Optional;

public interface ICompanyService extends IGerenalService<Company> {
    Optional<Company> findCompanyByAccount_UserName(String userName);

    List<Company> getAllCompany(Integer pageNo, Integer pageSize);
}
