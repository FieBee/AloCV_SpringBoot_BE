package com.example.alocv_be.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class JobField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<Job> jobList;

    private boolean status;

    public JobField() {
    }
}