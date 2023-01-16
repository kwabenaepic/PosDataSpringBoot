package com.kwabena.posdataapi.repository;

import com.kwabena.posdataapi.model.SalesReportView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalereportViewRepository extends JpaRepository<SalesReportView, Long> {
}
