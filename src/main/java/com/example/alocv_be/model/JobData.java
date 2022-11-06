package com.example.alocv_be.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
public class JobData {
    private Long id;
    private String name;
    private Long job_field_id;
    private Long salary_range;
    private Long location_id;
    private String position;
    private String experience;
    private String job_type;
    private LocalDate expired_date;
    private String description;
    private Long recruit_number;
    private String gender;
    private List<CV> cvList;
}
