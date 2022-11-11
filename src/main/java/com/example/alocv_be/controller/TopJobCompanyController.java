package com.example.alocv_be.controller;

import com.example.alocv_be.config.dto.TopJopCompanyDto;
import com.example.alocv_be.model.Job;
import com.example.alocv_be.repo.CompanyRepo;
import com.example.alocv_be.repo.IJobRepo;
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

    @Autowired
    IJobRepo jobRepo;
//    phương thức hiện các công ty có lượng tuyển dụng cao nhất trở xuống
    @GetMapping
    public ResponseEntity <List<TopJopCompanyDto>> topJopCompanyDtoList (){
        return ResponseEntity.ok(companyRepo.topJopCompany());
    }


//    Phương thức in ra các job được đăng gần nhất

   @GetMapping("/newjob")
    public ResponseEntity<List<Job>> newDisplayJob () {
        return ResponseEntity.ok(jobRepo.getNewDisplayJob());
   }
}
