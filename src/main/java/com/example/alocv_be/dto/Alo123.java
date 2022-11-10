package com.example.alocv_be.dto;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface Alo123 {
    @JsonIgnore
    String getJobName();

    @JsonProperty("Companynammmmmmmmmee")
    String getCompanyName();
}
