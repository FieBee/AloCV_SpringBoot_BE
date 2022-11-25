package com.example.alocv_be.service.account;


import com.example.alocv_be.dto.AccountResDTO;
import com.example.alocv_be.dto.Alo123;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService, UserDetailsService {

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    UserRepo userRepo;

    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public Iterable<AccountResDTO> findAll(Pageable pageable) {
        List<Account> accounts = (List<Account>) accountRepo.findAll();
        List<AccountResDTO> accountResDTO = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            String userName = accounts.get(i).getUserName();
            Long id = accounts.get(i).getId();
            accountResDTO.add(new AccountResDTO(id,userName));
        }
        return accountResDTO;
    }

    @Override
    public Iterable<Account> findAll() {
        return accountRepo.findAll();
    }

    @Override
    public Optional<Account> findById(Long id) {
        return accountRepo.findById(id);
    }

    @Override
    public Object save(Object o) {
        return null;
    }


    @Override
    public Account save(Account account) {
        account.setStatus(true);
        return accountRepo.save(account);
    }

    @Override
    public Account remove(Long id) {
        Optional<Account> account = accountRepo.findById(id);
        account.get().setStatus(false);
        return account.get();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepo.findAccountByUserName(username);
        return new User(account.getUserName(),account.getPassword(),account.getAppRole());
    }

    @Override
    public Optional<Account> findAccountById(Long id) {
        return accountRepo.findById(id);
    }

    @Override
    public Account findAccountByUserName(String username) {
        Account account = accountRepo.findAccountByUserName(username);
        return account;
    }

    @Override
    public Account edit(Long id, Account account) {
        Optional<Account> accounts = accountRepo.findById(id);
        account.setId(accounts.get().getId());
        account.setActive(true);
        account.setStatus(true);
        return account;
    }

    @Override
    public Alo123 getAlo123(){
        return this.accountRepo.getAlo123();
    }

    @Override
    public Iterable<Account> findAccountUser() {
        return accountRepo.findAccountUser();
    }

    @Override
    public Iterable<Account> findAccountCompany() {
        return accountRepo.findAccountCompany();
    }

    @Override
    public List<AccountResDTO> findAllByStatusIsTrueAndActiveIsTrue() {
            List<Account> accounts = accountRepo.findAllByStatusIsTrueAndActiveIsTrue();
            List<AccountResDTO> accountResDTO = new ArrayList<>();
            for (int i = 0; i < accounts.size(); i++) {
                String userName = accounts.get(i).getUserName();
                Long id = accounts.get(i).getId();
                accountResDTO.add(new AccountResDTO(id,userName));
            }
            return accountResDTO;
    }

    @Override
    public Account unBlockAccount(Long id) {
        Optional<Account> accounts = accountRepo.findById(id);
        accountRepo.save(accounts.get());
        return accounts.get();
    }

    @Override
    public Account setAciveAccountIsTrue(Long id) {
        Optional<Account> accounts = accountRepo.findById(id);
        accounts.get().setActive(true);
        accountRepo.save(accounts.get());
        return accounts.get();
    }
}

