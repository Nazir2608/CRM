package com.nazir.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazir.crm.entity.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {

}
