package com.quick.carpool.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quick.carpool.notification.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
