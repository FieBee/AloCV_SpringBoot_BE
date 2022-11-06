package com.example.alocv_be.repo;

import com.example.alocv_be.model.CV;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepo extends PagingAndSortingRepository<CV, Long> {

}
