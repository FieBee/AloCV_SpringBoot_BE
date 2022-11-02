package com.example.alocv_be.repo;

import com.example.alocv_be.model.entity.Account;
import lombok.extern.java.Log;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<Account, Long> {
    Account findAccountById(Long id);

//    Account findByAccount(String account);

    Account findAccountByUserName(String account);
}
