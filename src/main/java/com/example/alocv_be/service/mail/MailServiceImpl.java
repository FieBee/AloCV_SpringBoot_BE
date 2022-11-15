package com.example.alocv_be.service.mail;

import com.example.alocv_be.model.Account;
import com.example.alocv_be.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service("mailService")
public class MailServiceImpl implements MailService{
    @Autowired
    JavaMailSender mailSender;

    public void sendEmail(Account account) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        Mail mail = new Mail();
        mail.setMailFrom("nhom1codegymc0522g1@gmail.com");
        mail.setMailTo(account.getUserName());
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Tạo tài khoản AloCV thành công, giờ đây bạn có thể đăng nhập!!! " +
                "Mật khẩu được cấp của bạn là: "+account.getPassword()+".");
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setSubject(mail.getMailSubject());
            mimeMessageHelper.setFrom(new InternetAddress(mail.getMailFrom(), "nhom1codegymc0522g1@gmail.com"));
            mimeMessageHelper.setTo(mail.getMailTo());
            mimeMessageHelper.setText(mail.getMailContent());

            mailSender.send(mimeMessageHelper.getMimeMessage());

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
