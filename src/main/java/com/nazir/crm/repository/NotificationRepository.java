package com.nazir.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazir.crm.entity.Event;
import com.nazir.crm.entity.Notification;
import com.nazir.crm.entity.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	Notification findFirstByEventOrderByCreatedDesc(Event event);
	List<Notification> findByEvent(Event event);
	List<Notification> findByUser(User user);
	
}
