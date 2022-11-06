package com.example.alocv_be.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company extends DateAt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Account account;
    private String image;
    private String address;
    private Long staffNumber;
    private String branch;
    private String linkMap;
    private String linkFb;
    private boolean status;





}
