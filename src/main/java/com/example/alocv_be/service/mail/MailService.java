package com.example.alocv_be.service.mail;

import com.example.alocv_be.model.*;

public interface MailService {
    public void sendEmail(Account account);

    public void sendEmailApply(User user, Long job);

    void shareJob(String user1, String user2, String link);

    void getOTP(String userName,String otp);
}
