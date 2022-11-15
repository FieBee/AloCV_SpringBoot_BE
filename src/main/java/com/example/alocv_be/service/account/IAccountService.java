package com.example.alocv_be.service.account;

import com.example.alocv_be.dto.AccountResDTO;
import com.example.alocv_be.dto.Alo123;
import com.example.alocv_be.model.Account;
import com.example.alocv_be.service.IGerenalService;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IAccountService extends IGerenalService {
    Account save(Account account);

    Optional<Account> findAccountById(Long id);

    Iterable<AccountResDTO> findAll(Pageable pageable);

    Account findAccountByUserName(String account);

    Alo123 getAlo123();

    Iterable<Account>findAccountUser();
    Iterable<Account>findAccountCompany();
}
