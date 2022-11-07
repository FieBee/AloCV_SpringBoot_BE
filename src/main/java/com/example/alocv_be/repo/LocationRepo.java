package com.example.alocv_be.repo;

import com.example.alocv_be.model.Location;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends PagingAndSortingRepository<Location, Long> {
}
