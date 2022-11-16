package com.example.alocv_be.controller;

import com.example.alocv_be.model.Company;
import com.example.alocv_be.model.Job;
import com.example.alocv_be.model.Mail;
import com.example.alocv_be.model.User;
import com.example.alocv_be.service.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/mail")
public class EmailController {
    @Autowired
    private MailService mailService;

    @PostMapping ("/apply/{jobId}")
    public void home(@RequestBody User user,@PathVariable Long jobId){
        mailService.sendEmailApply(user,jobId);
    }

    @PostMapping("/share/{user1}/{user2}/{link}")
    public void shareJob(@PathVariable String user1,@PathVariable String user2,@PathVariable String link){
        mailService.shareJob(user1,user2,link);
    }

}
