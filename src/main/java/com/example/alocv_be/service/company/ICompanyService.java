package com.example.alocv_be.service.company;

import com.example.alocv_be.model.Company;
import com.example.alocv_be.service.IGerenalService;

import java.util.Optional;

public interface ICompanyService extends IGerenalService<Company> {
    Optional<Company> findCompanyByAccount_UserName(String userName);
}
