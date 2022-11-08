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

    @PostMapping ( "/mail/{mailTo}/{password}")
    public void home(@PathVariable String mailTo,String password){
        Mail mail = new Mail();
        mail.setMailFrom("AloCV@gmail.com");
        mail.setMailTo(mailTo);
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Tạo tài khoản AloCV thành công, giờ đây bạn có thể đăng nhập!!! " +
                "Mật khẩu được cấp của bạn là: "+password+".");
        mailService.sendEmail(mail);
    }

    //some other cMde


}
