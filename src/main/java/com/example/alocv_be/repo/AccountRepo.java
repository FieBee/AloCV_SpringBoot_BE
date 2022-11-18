package com.example.alocv_be.repo;

import com.example.alocv_be.dto.Alo123;
import com.example.alocv_be.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<Account, Long> {

    Account findAccountByUserName(String account);

    @Query(value = "SELECT e.name as jobName , company.name as companyName\n" +
            "FROM job as e\n" +
            "         LEFT JOIN  company on e.company_id = company.id limit 1", nativeQuery = true)
    Alo123 getAlo123();

    @Query(value = "SELECT *" +
            "FROM account \n" +
            " JOIN  account_app_role on account.id = account_app_role.account_id "+
            "WHERE account_app_role.app_role_id = 3 ", nativeQuery = true)
    List<Account> findAccountUser();

    @Query(value = "SELECT *" +
            "FROM account \n" +
            "JOIN  account_app_role on account.id = account_app_role.account_id "+
            "WHERE account_app_role.app_role_id = 2 ", nativeQuery = true)
    List<Account> findAccountCompany();


    List<Account> findAllByStatusIsTrueAndActiveIsTrue();
}
