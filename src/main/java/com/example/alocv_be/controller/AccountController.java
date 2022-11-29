package com.example.alocv_be.controller;


import com.example.alocv_be.dto.AccountResDTO;
import com.example.alocv_be.model.Account;
import com.example.alocv_be.service.account.IAccountService;
import com.example.alocv_be.service.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
     *
     * @param pageable phân trang
     * @return Toàn bộ account đang có
     */
    @GetMapping
    public ResponseEntity<Iterable<AccountResDTO>> findAllAccount(Pageable pageable) {
        return new ResponseEntity<>(accountService.findAll(pageable), HttpStatus.OK);
    }

    /**
     * Phương
     *
     * @return Toàn bộ account đang được phép hoạt động
     */
    @GetMapping("/getAllIsTrue")
    public ResponseEntity<Iterable<AccountResDTO>> findAllAccountByStatusIsTrueAndActiveIsTrue() {
        return new ResponseEntity<>(accountService.findAllByStatusIsTrueAndActiveIsTrue(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id) {
        Optional<Account> accounts = accountService.findById(id);
        return accounts.map(account -> new ResponseEntity<>(account, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        this.mailService.sendEmail(account);
        return new ResponseEntity<>(accountService.save(account), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account account) {
        return new ResponseEntity<>(accountService.save(accountService.edit(id, account)), HttpStatus.OK);
    }

    @GetMapping("/block/{id}")
    public ResponseEntity<Account> blockAccount(@PathVariable Long id) {
        return new ResponseEntity<>(accountService.remove(id), HttpStatus.OK);
    }

    @GetMapping("/unblock/{id}")
    public ResponseEntity<Account> unBlockAccount(@PathVariable Long id) {
        return new ResponseEntity<>(accountService.unBlockAccount(id), HttpStatus.OK);
    }

    /**
     * Phương
     *
     * @return Tài khoản đã phê duyệt sau đăng ký
     */
    @GetMapping("/setActive/{id}")
    public ResponseEntity<Account> setAciveAccountIsTrue(@PathVariable Long id) {
        return new ResponseEntity<>(accountService.setAciveAccountIsTrue(id), HttpStatus.OK);
    }



    /**
     * Phương
     *
     * @return Toàn bộ account user đang có
     */
    @GetMapping("/getUser")
    public ResponseEntity<Iterable<Account>> findAllAccountUser() {
        return new ResponseEntity<>(accountService.findAccountUser(), HttpStatus.OK);
    }

    /**
     * Phương
     *
     * @return Toàn bộ account company đang có
     */
    @GetMapping("/getCompany")
    public ResponseEntity<Iterable<Account>> findAllAccountCompany() {
        return new ResponseEntity<>(accountService.findAccountCompany(), HttpStatus.OK);
    }

    //    @GetMapping("/alo123")
//    public ResponseEntity<Alo123> getAlo() {
//        return new ResponseEntity<>(accountService.getAlo123(), HttpStatus.OK);
//    }
}
