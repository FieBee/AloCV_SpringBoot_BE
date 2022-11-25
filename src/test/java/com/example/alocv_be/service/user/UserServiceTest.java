package com.example.alocv_be.service.user;


import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.User;
import com.example.alocv_be.repo.UserRepo;
import com.example.alocv_be.service.user.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    private UserRepo userRepo = mock(UserRepo.class);
    private UserService userService = new UserService(userRepo);

    @BeforeEach
    void init() {
        User user = new User();
        user.setId(1L);
        user.setName("phuonga13");
        Account account = new Account();
        account.setUserName("user@gmail.com");
        account.setPassword("123");
        user.setAccount(account);

        doReturn(Optional.of(user)).when(userRepo).findById(1L);
        doReturn(Optional.of(user)).when(userRepo).findStudentByAccount_UserName("user@gmail.com");

        List<User> userList = Arrays.asList(user);
        doReturn(userList).when(userRepo).findAll();
    }

    @Test
    @DisplayName("findAll can return list is not null")
    void whenFindAllNotNull() {
        assertThat(userService.findAll(Pageable.unpaged())).isNotEmpty();
    }

    @Test
    @DisplayName("findbyID return user name phuonga13")
    void whenFindById_thenReturnUser() {
        String name = "phuonga13";
        Optional<User> user = userRepo.findById(1L);
        assertThat(user.get().getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("findbyID 2L return isPresent")
    public void whenFindById_thenReturnUserIsPresent() {
        Optional<User> user = userRepo.findById(2L);
        assertThat(user.isPresent()).isFalse();
    }

    @Test
    @DisplayName("save User")
    void save() {
        User user = new User();
        user.setId(2L);
        user.setName("alo123");
        userService.save(user);
        verify(userRepo, times(1)).save(user);
    }

    @Test
    @DisplayName("findbyAccountUserName return user")
    void whenFindByAccountUserName_thenReturnUser() {
        String name = "phuonga13";
        Optional<User> user = userService.findUserByAccount_UserName("user@gmail.com");
        assertThat(user.get().getName()).isEqualTo(name);
    }
}
