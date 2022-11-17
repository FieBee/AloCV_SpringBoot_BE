package com.example.alocv_be.service.mail;

import com.example.alocv_be.model.*;
import com.example.alocv_be.service.job.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service("mailService")
public class MailServiceImpl implements MailService {
    @Autowired
    JavaMailSender mailSender;

    @Autowired
    IJobService jobService;

    public void sendEmail(Account account) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        Mail mail = new Mail();
        mail.setMailFrom("AloCV@gmail.com");
        mail.setMailTo(account.getUserName());
        mail.setMailSubject("AloCV - Tạo tài khoản");
        mail.setMailContent("Tạo tài khoản AloCV thành công, giờ đây bạn có thể đăng nhập!!! " +
                "Mật khẩu được cấp của bạn là: " + account.getPassword() + ".");
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setSubject(mail.getMailSubject());
            mimeMessageHelper.setFrom(new InternetAddress(mail.getMailFrom(), "AloCV@gmail.com"));
            mimeMessageHelper.setTo(mail.getMailTo());
            mimeMessageHelper.setText(mail.getMailContent());

            mailSender.send(mimeMessageHelper.getMimeMessage());

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void sendEmailApply(User user, Long jobId) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Optional<Job> job = jobService.findById(jobId);

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        Mail mail = new Mail();
        mail.setMailFrom("ALoCV@gmail.com");
        mail.setMailTo(user.getAccount().getUserName());
        mail.setMailSubject(job.get().getCompany().getName());
        mail.setMailContent("Thân gửi:  Bạn " + user.getAccount().getUserName() + ",\n" +
                "Cảm ơn bạn đã quan tâm và ứng tuyển vị trí " + job.get().getName() + ". Qua hồ sơ của bạn, Công ty nhận thấy bạn là ứng viên tiềm năng và phù hợp với vị trí này.\n" +
                "\n" +
                "Để bạn có thể hiểu rõ hơn về Công ty và vị trí ứng tuyển, cũng như tạo điều kiện cho Công ty đánh giá chính xác hơn về kiến thức, năng lực, kinh nghiệm làm việc và mức độ phù hợp của bạn với vị trí," + job.get().getCompany().getName() + " trân trọng mời bạn tham dự buổi phỏng vấn trực tiếp tại văn phòng công ty, chi tiết như sau:\n" +
                "\n" +
                "        1. Vị trí phỏng vấn:       " + job.get().getName() + "\n" +
                "\n" +
                "        2. Thời gian phỏng vấn: 16h00 chiều ngày " + LocalDate.now().plusDays(7).format(formatter) + "\n" +
                "\n" +
                "        3. Địa điểm: " + job.get().getCompany().getAddress() + "\n" +
                "\n" +
                "        4. Liên hệ:  Ms. P 0328885251\n" +
                "\n" +
                "        5. Bạn vui lòng trả lời mail xác nhận khả năng tham gia phỏng vấn \n" +
                "\n" +
                "Nếu cần thay đổi về thời gian, hoặc cần thêm thông tin, bạn có thể phản hồi ngay qua email này hoặc liên hệ SĐT 0328885251 để được hỗ trợ ngay nhé.\n" +
                "\n" +
                "Công ty rất mong sớm được gặp và trò chuyện cùng bạn\n" +
                "\n" +
                "Thanks & Best regards,");
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setSubject(mail.getMailSubject());
            mimeMessageHelper.setFrom(new InternetAddress(mail.getMailFrom(), "AloCV@gmail.com"));
            mimeMessageHelper.setTo(mail.getMailTo());
            mimeMessageHelper.setText(mail.getMailContent());

            mailSender.send(mimeMessageHelper.getMimeMessage());

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shareJob(String user1, String user2, String jobId) {

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        Mail mail = new Mail();
        mail.setMailFrom("ALoCV@gmail.com");
        mail.setMailTo(user2);
        mail.setMailSubject("AloCV - Chia sẻ việc làm!");
        mail.setMailContent("Bạn nhận được một chia sẻ việc làm từ: '" + user1 + "',\n" +
                "Nhấn vào đây để xem chi tiết: http://localhost:4200/job/job-detail/" + jobId);
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setSubject(mail.getMailSubject());
            mimeMessageHelper.setFrom(new InternetAddress(mail.getMailFrom(), "AloCV@gmail.com"));
            mimeMessageHelper.setTo(mail.getMailTo());
            mimeMessageHelper.setText(mail.getMailContent());

            mailSender.send(mimeMessageHelper.getMimeMessage());

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void getOTP(String userName,String otp) {

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        Mail mail = new Mail();
        mail.setMailFrom("ALoCV@gmail.com");
        mail.setMailTo(userName);
        mail.setMailSubject("AloCV - Bảo mật!");
        mail.setMailContent("Mã OTP của bạn là: " + otp);
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setSubject(mail.getMailSubject());
            mimeMessageHelper.setFrom(new InternetAddress(mail.getMailFrom(), "AloCV@gmail.com"));
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
