package com.example.alocv_be.service.account;


import com.example.alocv_be.model.Account;
import com.example.alocv_be.repo.AccountRepo;
import com.example.alocv_be.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService implements IAccountService, UserDetailsService {

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    UserRepo userRepo;

    @Override
    public Iterable<Account> findAll(Pageable pageable) {
        return accountRepo.findAll();
    }

    @Override
    public Optional<Account> findById(Long id) {
        return accountRepo.findById(id);
    }

    @Override
    public Account save(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public void remove(Long id) {
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepo.findAccountByUserName(username);
        return new User(account.getUserName(),account.getPassword(),  account.getAppRole());
    }

    @Override
    public Optional<Account> findAccountById(Long id) {
        return accountRepo.findById(id);
    }

    @Override
    public Account findAccountByUserName(String username) {
        return accountRepo.findAccountByUserName(username);
    }


}
