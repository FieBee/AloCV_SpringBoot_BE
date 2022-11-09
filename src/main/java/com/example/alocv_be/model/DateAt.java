package com.example.alocv_be.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class DateAt {
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    @JsonIgnore
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    @JsonIgnore
    private Date updatedAt;

}
