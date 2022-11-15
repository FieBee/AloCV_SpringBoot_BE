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

<<<<<<< HEAD
    @PostMapping("/gmail/{mail}")
    public String home(@RequestParam Mail mail){
        mail.setMailFrom("nhom1vjpPr0no1@gmail.com");
        mail.setMailTo(String.valueOf(mail));
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Learn How to send Email using Spring Boot!!!");

        mailService.sendEmail(mail);
        return "home";
    }

    //some other cMde

//    @PostMapping(value = "/email")
//    public ResponseEntity<Mail> enviarEmail(){
//        try {
//            Mail mail = new Mail();
=======
//    @PostMapping ("/mail/{mailTo}/")
//    public void home(@PathVariable String mailTo,String password){
//        Mail mail = new Mail();
>>>>>>> c8fa75e20ffd429a1f52df98c14a7a1df772b656
//        mail.setMailFrom("nhom1vjppronumber1@gmail.com");
//        mail.setMailTo(mailTo);
//        mail.setMailSubject("Spring Boot - Email Example");
<<<<<<< HEAD
//        mail.setMailContent("Learn How to send Email using Spring Boot!!!");
//            mailService.sendEmail(mail);
//            return new ResponseEntity<>(mail,  HttpStatus.OK);
//        } catch( MailException e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
=======
//        mail.setMailContent("Tạo tài khoản AloCV thành công, giờ đây bạn có thể đăng nhập!!! " +
//                "Mật khẩu được cấp của bạn là: "+password+".");
//        mailService.sendEmail(mail);
//    }

    //some other cMde


>>>>>>> c8fa75e20ffd429a1f52df98c14a7a1df772b656
}
