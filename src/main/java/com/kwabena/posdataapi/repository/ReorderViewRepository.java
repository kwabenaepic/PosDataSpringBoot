package com.kwabena.posdataapi.repository;

import com.kwabena.posdataapi.model.ReorderView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReorderViewRepository extends JpaRepository<ReorderView, Long> {
}
