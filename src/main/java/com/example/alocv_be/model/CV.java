package com.example.alocv_be.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CV extends DateAt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String image;
    private boolean status;

    @ManyToOne
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    private Job job;
    private boolean apply;

}
