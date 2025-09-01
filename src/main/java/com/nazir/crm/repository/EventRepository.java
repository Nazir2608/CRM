package com.nazir.crm.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazir.crm.entity.Client;
import com.nazir.crm.entity.Contract;
import com.nazir.crm.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	List<Event> findByTimeAfter(LocalDateTime dateTime);
	List<Event> findByTimeBetween(LocalDateTime start, LocalDateTime end);
	List<Event> findByClient(Client client);

}
