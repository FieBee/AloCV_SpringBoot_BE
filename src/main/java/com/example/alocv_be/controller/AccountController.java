package com.example.alocv_be.controller;


import com.example.alocv_be.dto.AccountResDTO;
import com.example.alocv_be.dto.Alo123;
import com.example.alocv_be.model.Account;
import com.example.alocv_be.service.account.IAccountService;
import com.example.alocv_be.service.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @Autowired
    MailService mailService;


    /**
     * Phương
     * @param pageable phân trang
     * @return toàn bộ account đang có
     */
    @GetMapping
    public ResponseEntity<Iterable<AccountResDTO>> findAllAccount(Pageable pageable) {
        List<AccountResDTO> accountResDTOS = (List<AccountResDTO>) accountService.findAll(pageable);
        return new ResponseEntity<>(accountResDTOS, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id) {
        Optional<Account> accounts = accountService.findById(id);
        return accounts.map(account -> new ResponseEntity<>(account, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
//        this.mailService.sendEmail(account);
        account.setStatus(true);
        return new ResponseEntity<>(accountService.save(account), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account account) {
        Optional<Account> accounts = accountService.findById(id);
        if (!accounts.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        account.setId(accounts.get().getId());
        return new ResponseEntity<>(accountService.save(account), HttpStatus.OK);
    }

    @DeleteMapping("/block/{id}")
    public ResponseEntity<Account> deleteAccount(@PathVariable Long id) {
        Optional<Account> accounts = accountService.findById(id);
        if (!accounts.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        accounts.get().setStatus(false);
        accountService.save(accounts.get());
        return new ResponseEntity<>(accounts.get(), HttpStatus.OK);
    }

    @DeleteMapping("/unblock/{id}")
    public ResponseEntity<Account> unBlockAccount(@PathVariable Long id) {
        Optional<Account> accounts = accountService.findById(id);
        if (!accounts.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        accounts.get().setStatus(true);
        accountService.save(accounts.get());
        return new ResponseEntity<>(accounts.get(), HttpStatus.OK);
    }


    @DeleteMapping("/setActive/{id}")
    public ResponseEntity<Account> setAciveAccountIsTrue(@PathVariable Long id) {
        Optional<Account> accounts = accountService.findById(id);
        if (!accounts.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        accounts.get().setActive(true);
        accountService.save(accounts.get());
        return new ResponseEntity<>(accounts.get(), HttpStatus.OK);
    }

//    @GetMapping("/alo123")
//    public ResponseEntity<Alo123> getAlo() {
//        return new ResponseEntity<>(accountService.getAlo123(), HttpStatus.OK);
//    }

    /**
     * Phương
     * @return toàn bộ account vai user đang có
     */
    @GetMapping("/getUser")
    public ResponseEntity<Iterable<Account>> findAllAccountUser() {
        List<Account> accounts = (List<Account>) accountService.findAccountUser();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    /**
     * Phương
     * @return toàn bộ account vai company đang có
     */
    @GetMapping("/getCompany")
    public ResponseEntity<Iterable<Account>> findAllAccountCompany() {
        List<Account> accounts = (List<Account>) accountService.findAccountCompany();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }
}
