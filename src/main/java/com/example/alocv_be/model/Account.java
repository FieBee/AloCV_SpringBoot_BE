package com.example.alocv_be.model;

import com.example.alocv_be.model.AppRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    private String userName;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppRole> appRole;

}
