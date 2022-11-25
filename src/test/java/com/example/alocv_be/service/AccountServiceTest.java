package com.example.alocv_be.service;

import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.AppRole;
import com.example.alocv_be.repo.AccountRepo;
import com.example.alocv_be.service.account.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class AccountServiceTest {
    private AccountRepo accountRepofake = Mockito.mock(AccountRepo.class);

    private AccountService accountService = new AccountService(accountRepofake);


    @BeforeEach
    void init() {
        Account account = new Account();
        AppRole appRole = new AppRole(1L, "ROLE_ADMIN");
        account.setId(1L);
        account.setUserName("admin@gmail.com");
        account.setPassword("123");
        Set<AppRole> appRoles = new HashSet<>();
        appRoles.add(appRole);
        account.setAppRole(appRoles);

        doReturn(Optional.of(account)).when(accountRepofake).findById(1L);
        doReturn(account).when(accountRepofake).findAccountByUserName("admin@gmail.com");

        List<Account> accountList = Arrays.asList(account);
        doReturn(accountList).when(accountRepofake).findAll();
    }

    @Test
    @DisplayName("findAll can return list is not null")
    void whenFindAllNotNull() {
        assertThat(accountService.findAll()).isNotEmpty();
    }

    @Test
    @DisplayName("findbyID return account name admin@gmail.com")
    void whenfindById_thenReturnAccount() {
        String name = "admin@gmail.com";
        Optional<Account> account = accountService.findById(1L);
        assertThat(account.get().getUserName()).isEqualTo(name);
    }

    @Test
    @DisplayName("findbyID 2L return isPresent")
    public void whenfindById_thenReturnAccountisPresent() {
        Optional<Account> account = accountService.findById(2L);
        assertThat(account.isPresent()).isFalse();
    }

    @Test
    @DisplayName("save Account use 1 accountRepository.save")
    void save() {
        Account account = new Account();
        account.setId(2L);
        account.setUserName("alo123@gmail.com");
        accountService.save(account);
        verify(accountRepofake, times(1)).save(account);
    }


    @Test
    @DisplayName("remove Account, status is false")
    void remove() {
        Optional<Account> account = accountService.findById(1L);
        assertThat(account.get().getStatus()).isFalse();
    }

    @Test
    @DisplayName("findAccountByUserName return account")
    public void whenfindByUserName_thenReturnAccount() {
        Account account = accountService.findAccountByUserName("admin@gmail.com");
        assertThat(account).isNotNull();
    }

    @Test
    @DisplayName("edit Account use 1 accountRepository.edit, active , status = true")
    void edit() {
        Account account = new Account();
        account.setId(1L);
        account.setUserName("alo123@gmail.com");
        accountService.edit(1L, account);
        assertThat(account.getStatus() && account.getActive()).isEqualTo(true);
    }

}
