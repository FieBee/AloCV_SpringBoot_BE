package com.example.alocv_be.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    @ManyToOne
    private JobField jobField;

    private Long salaryRange;

    @Transient
    @ManyToOne
    private Location location;


    private String position;
    private String experience;
    private String jobType;
    private LocalDate expiredDate;
    private String description;
    private Long recruitNumber;
    private String gender;

    @OneToMany
    private List<CV> cvList;


    public Job() {
    }


}
