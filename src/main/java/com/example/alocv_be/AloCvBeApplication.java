package com.example.alocv_be;

import com.example.alocv_be.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AloCvBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AloCvBeApplication.class, args);
//        User user = SpringApplication.run(AloCvBeApplication.class, args).getBean(User.class);
    }

}
