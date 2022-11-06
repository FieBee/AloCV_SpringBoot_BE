package com.example.alocv_be.service.account;

import com.example.alocv_be.model.Account;
import com.example.alocv_be.service.IGerenalService;

import java.util.Optional;

public interface IAccountService extends IGerenalService<Account> {
    Optional<Account> findAccountById(Long id);

//    Account findByAccount(String account);

    Account findAccountByUserName(String account);
}
