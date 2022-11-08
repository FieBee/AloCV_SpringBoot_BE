package com.example.alocv_be.service.mail;

import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.Mail;

public interface MailService {
    public void sendEmail(Account account);
}
