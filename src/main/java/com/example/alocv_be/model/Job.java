package com.example.alocv_be.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
public class Job extends DateAt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    private JobField jobField;

    private Long salaryRange;


    @ManyToOne(fetch = FetchType.EAGER)
    private Location location;

    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;

    private String position;
    private String experience;
    private String jobType;
    private LocalDate expiredDate;
    private String description;
    private Long recruitNumber;
    private String gender;



    public Job() {
    }


}
