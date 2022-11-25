package com.example.alocv_be.controller;



import com.example.alocv_be.model.Account;
import com.example.alocv_be.service.account.IAccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AccountControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mvc;

    @Autowired
    private IAccountService accountService;

    @BeforeEach
    private void init() {
        Account account1 = new Account();
        account1.setUserName("admin@gmail.com");
        account1.setId(1L);
        Account account2 = new Account();
        account2.setUserName("company@gmail.com");
        account2.setId(2L);

        accountService.save(account1);
        accountService.save(account2);

        mvc = MockMvcBuilders
                .webAppContextSetup(webApplicationContext)
                .apply(springSecurity())
                .build();
    }


    @Test
    @WithMockUser(username = "admin", roles = "ADMIN")
    @DisplayName("find all account return status 200")
    void findAll_whenGetCategoriesWithRoleAdmin_thenReturnStatus200() throws Exception {
        mvc.perform(get("/account").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
