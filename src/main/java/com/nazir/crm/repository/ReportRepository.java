package com.nazir.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazir.crm.entity.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

}
