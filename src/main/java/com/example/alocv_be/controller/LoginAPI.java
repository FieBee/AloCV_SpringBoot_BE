package com.example.alocv_be.controller;



import com.example.alocv_be.dto.AccountToken;
import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.AppRole;
import com.example.alocv_be.service.JwtService;
import com.example.alocv_be.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@CrossOrigin("*")
public class LoginAPI {
    @Autowired
    JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @Autowired
    AccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Account account) {
        try {
            // Tạo ra 1 đối tượng Authentication.
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(account.getUserName(), account.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);

            String token = jwtService.createToken(authentication);
            Account account1 = accountService.findAccountByUserName(account.getUserName());

            AccountToken accountToken = AccountToken.builder().userName(account1.getUserName())
                    .password(account1.getPassword())
                    .appRole(account1.getAppRole())
                    .token(token)
                    .status(account1.getStatus())
                    .active(account1.getActive())
                    .build();
            return new ResponseEntity<>(accountToken, HttpStatus.OK);
        } catch (Exception e) {
            System.err.println("sai roi`");
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/register")
    public ResponseEntity<Account> register(@RequestBody Account appUser) {
        Set<AppRole> roles = new HashSet<>();
        AppRole role = new AppRole();
        role.setId(2L);
        roles.add(role);
        appUser.setAppRole(roles);
        return new ResponseEntity<>(accountService.save(appUser), HttpStatus.OK);
    }

}
