package com.example.alocv_be.service.company;

import com.example.alocv_be.model.entity.Company;
import com.example.alocv_be.model.entity.User;
import com.example.alocv_be.service.IGerenalService;

import java.util.Optional;

public interface ICompanyService extends IGerenalService<Company> {
    Optional<User> findCompanyByAccount_UserName(String userName);
}
