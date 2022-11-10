package com.example.alocv_be.dto;

import com.example.alocv_be.model.AppRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AccountToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotEmpty
    String userName;

    @NotEmpty
    @Min(value = 5, message = "mật khẩu phải bao gồm 5 kí tự trở lên")
    String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppRole> appRole;

    private String token;



}
