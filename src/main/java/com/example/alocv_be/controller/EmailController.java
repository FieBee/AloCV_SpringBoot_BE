package com.example.alocv_be.controller;

import com.example.alocv_be.model.Mail;
import com.example.alocv_be.service.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping()
public class EmailController {
    @Autowired
    private MailService mailService;

//    @GetMapping("/home")
//    public String home(){
//        Mail mail = new Mail();
//        mail.setMailFrom("nhom1vjppronumber1@gmail.com");
//        mail.setMailTo("thoitran2107@gmail.com");
//        mail.setMailSubject("Spring Boot - Email Example");
//        mail.setMailContent("Learn How to send Email using Spring Boot!!!");
//
//        mailService.sendEmail(mail);
//        return "home";
//    }

    //some other cMde

    @PostMapping(value = "/email")
    public ResponseEntity<Mail> enviarEmail(){
        try {
            Mail mail = new Mail();
        mail.setMailFrom("nhom1vjppronumber1@gmail.com");
        mail.setMailTo("thoitran2107@gmail.com");
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Learn How to send Email using Spring Boot!!!");
            mailService.sendEmail(mail);
            return new ResponseEntity<>(mail,  HttpStatus.OK);
        } catch( MailException e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
