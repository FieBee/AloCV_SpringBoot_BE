package com.example.alocv_be.repo;

import com.example.alocv_be.model.Notification;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepo extends PagingAndSortingRepository<Notification, Long> {
}
