package com.example.alocv_be.service;

import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.Company;
import com.example.alocv_be.model.User;
import com.example.alocv_be.repo.CompanyRepo;
import com.example.alocv_be.service.company.CompanyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CompanyServiceTest {
    private CompanyRepo companyRepo = mock(CompanyRepo.class);
    private CompanyService companyService = new CompanyService(companyRepo);

    @BeforeEach
    void init() {
        Company company = new Company();
        company.setId(1L);
        company.setName("phuonga13");
        Account account = new Account();
        account.setUserName("company@gmail.com");
        account.setPassword("123");
        company.setAccount(account);

        doReturn(Optional.of(company)).when(companyRepo).findById(1L);
        doReturn(Optional.of(company)).when(companyRepo).findCompanyByAccount_UserName("company@gmail.com");

        List<Company> companies = Arrays.asList(company);
        doReturn(companies).when(companyRepo).findAll();
    }

    @Test
    @DisplayName("findAll can return list is not null")
    void whenFindAllNotNull() {
        assertThat(companyService.findAll(Pageable.unpaged())).isNotEmpty();
    }

    @Test
    @DisplayName("findbyID return company name phuonga13")
    void whenFindById_thenReturnCompany() {
        String name = "phuonga13";
        Optional<Company> company = companyRepo.findById(1L);
        assertThat(company.get().getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("findbyID 2L return isPresent")
    public void whenFindById_thenReturnCompanyIsPresent() {
        Optional<Company> company = companyRepo.findById(2L);
        assertThat(company.isPresent()).isFalse();
    }

    @Test
    @DisplayName("save Company")
    void save() {
        Company company = new Company();
        company.setId(2L);
        company.setName("alo123");
        companyService.save(company);
        verify(companyRepo, times(1)).save(company);
    }

    @Test
    @DisplayName("findbyAccountUserName return company")
    void whenFindByAccountUserName_thenReturnCompany() {
        String name = "phuonga13";
        Optional<Company> company = companyService.findCompanyByAccount_UserName("company@gmail.com");
        assertThat(company.get().getName()).isEqualTo(name);
    }
}
