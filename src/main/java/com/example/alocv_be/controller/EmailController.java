package com.example.alocv_be.controller;

import com.example.alocv_be.model.*;
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


    /**
     * Phương
     * Gửi mail cho ứng viên ứng tuyển hẹn phỏng vấn
     */
    @PostMapping ("/apply/{jobId}")
    public void home(@RequestBody User user,@PathVariable Long jobId){
        mailService.sendEmailApply(user,jobId);
    }


    /**
     * Phương
     * Gửi mail chia sẻ tin tuyển dụng
     */
    @GetMapping("/share")
    public void shareJob(@RequestParam(value = "user1",required = false) String user1,
                         @RequestParam(value = "user2",required = false) String user2,
                         @RequestParam(value = "id",required = false) String id){
        mailService.shareJob(user1,user2,id);
    }


    @GetMapping("/otp")
    public void sendOTP(@RequestParam(value = "userName",required = false) String userName,
                         @RequestParam(value = "otp",required = false) String otp){
        mailService.getOTP(userName,otp);
    }

}
