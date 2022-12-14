package com.example.alocv_be.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location extends DateAt{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
//    @OneToMany
//    private List<Job> jobList;

    private boolean status;



    @Override
    public String toString() {
        return name;
    }
}
