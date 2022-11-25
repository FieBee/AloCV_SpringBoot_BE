package com.example.alocv_be.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends DateAt{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne
    private Account account;
    private String phoneNumber;
    private boolean status;
    private String image;
    private boolean isAdmin;


    public User(long l, String user) {
        this.id = l;
        this.name = user;
    }
}
