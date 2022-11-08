package com.example.alocv_be.controller;

import com.example.alocv_be.config.dto.TopJopCompanyDto;
import com.example.alocv_be.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topcompanyjob")
public class TopJobCompanyController {
    @Autowired
    CompanyRepo companyRepo;

    @GetMapping
    public ResponseEntity <List<TopJopCompanyDto>> topJopCompanyDtoList (){
        return ResponseEntity.ok(companyRepo.topJopCompany());
    }

}
