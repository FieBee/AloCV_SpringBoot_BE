package com.example.alocv_be.service.cv;

import com.example.alocv_be.model.CV;
import com.example.alocv_be.model.Job;
import com.example.alocv_be.service.IGerenalService;

import java.util.List;

public interface ICVService extends IGerenalService<CV> {
    List<CV> findCVByUserId(Long id);
}
