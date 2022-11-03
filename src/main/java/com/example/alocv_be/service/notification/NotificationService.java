package com.example.alocv_be.service.notification;

import com.example.alocv_be.model.entity.Notification;
import com.example.alocv_be.repo.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService implements INotificationService{
    @Autowired
    private NotificationRepo notificationRepo;

    @Override
    public Iterable<Notification> findAll(Pageable pageable) {
        return notificationRepo.findAll();
    }

    @Override
    public Optional<Notification> findById(Long id) {
        return notificationRepo.findById(id);
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRepo.save(notification);
    }

    @Override
    public void remove(Long id) {
        notificationRepo.deleteById(id);
    }
}
