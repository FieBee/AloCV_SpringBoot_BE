package com.example.alocv_be.controller;


import com.example.alocv_be.model.entity.Account;
import com.example.alocv_be.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @GetMapping
    public ResponseEntity<Iterable<Account>> findAllAccount(){
        List<Account> accounts = (List<Account>)accountService.findAll();
        if (accounts.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(accounts,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id){
        Optional<Account> accounts =accountService.findById(id);
        return accounts.map(account -> new ResponseEntity<>(account, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return new ResponseEntity<>(accountService.save(account), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account account) {
        Optional<Account> accounts = accountService.findById(id);
        if (!accounts.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        account.setId(accounts.get().getId());
        return new ResponseEntity<>(accountService.save(account),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Account> deleteAccount(@PathVariable Long id){
        Optional<Account> accounts = accountService.findById(id);
        if (!accounts.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        accountService.remove(id);
        return new ResponseEntity<>(accounts.get(),HttpStatus.OK);
    }

//    @GetMapping("/list")
//    public ModelAndView getAllAccount() {
//        ModelAndView modelAndView = new ModelAndView("/ajaxTeacher");
//        modelAndView.addObject("accounts", accountService.findAll());
//        return modelAndView;
//    }
}
