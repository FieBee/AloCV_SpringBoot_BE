package com.example.alocv_be.controller;

import com.example.alocv_be.model.Notification;
import com.example.alocv_be.service.notification.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private INotificationService notificationService;

    @GetMapping
    public ResponseEntity<Iterable<Notification>> findAllNotification(Pageable pageable) {
        List<Notification> notifications = (List<Notification>) notificationService.findAll(pageable);
        if (notifications.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> findNotificationById(@PathVariable Long id) {
        Optional<Notification> notificationOptional = notificationService.findById(id);
        if (!notificationOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(notificationOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Notification> saveNotification(@RequestBody Notification notification) {
        return new ResponseEntity<>(notificationService.save(notification), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Notification> updateNotification(@PathVariable Long id, @RequestBody Notification notification) {
        Optional<Notification> notificationOptional = notificationService.findById(id);
        if (!notificationOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        notification.setId(notificationOptional.get().getId());
        return new ResponseEntity<>(notificationService.save(notification), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Notification> deleteNotification(@PathVariable Long id) {
        Optional<Notification> notificationOptional = notificationService.findById(id);
        if (!notificationOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        notificationService.remove(id);
        return new ResponseEntity<>(notificationOptional.get(), HttpStatus.NO_CONTENT);
    }
}
