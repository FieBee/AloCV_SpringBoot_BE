package com.example.alocv_be.repo;

import com.example.alocv_be.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<Account, Long> {
    Account findAccountById(Long id);

    Account findAccountByUserName(String account);
}
