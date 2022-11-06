package com.example.alocv_be.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class JobField extends DateAt{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToMany(fetch = FetchType.LAZY)
//    private List<Job> jobList;

    private boolean status;

    public JobField() {
    }

    @Override
    public String toString() {
        return name;
    }
}
