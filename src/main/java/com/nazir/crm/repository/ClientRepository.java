package com.nazir.crm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazir.crm.entity.Client;
import com.nazir.crm.entity.User;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	Client findByNameIgnoreCase(String name);
	List<Client> findByNameContainingIgnoreCaseOrderByNameAsc(String name);
	List<Client> findByNameContainingIgnoreCaseAndAddressCityOrderByNameAsc(String name, String city);
	
	List<Client> findByUser(User user);
	List<Client> findByUserOrderByNameAsc(User user);
	List<Client> findByUserIn(List<User> users);
	
	List<Client> findByCreatedAfter(LocalDate date);
	List<Client> findByCreatedBetween(LocalDate startDate, LocalDate endDate);
	
	List<Client> findByStatusAndAddressCityOrderByNameAsc(String status, String city);
	List<Client> findByStatusOrderByNameAsc(String status);
	
	List<Client> findByAddressCityOrderByNameAsc(String city);
	List<Client> findByAddressCityContainingIgnoreCaseOrderByNameAsc(String city);
	List<Client> findByAddressRegionOrderByNameAsc(String region);
	
	List<Client> findByNipContaining(String nip);
	

}
