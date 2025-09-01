package com.nazir.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazir.crm.entity.Client;
import com.nazir.crm.entity.Contract;
import com.nazir.crm.entity.User;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
	List<Contract> findByClient(Client client);
	List<Contract> findByAcceptedBy(User user);

}
