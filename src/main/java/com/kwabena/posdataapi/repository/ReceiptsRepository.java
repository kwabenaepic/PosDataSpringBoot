package com.kwabena.posdataapi.repository;

import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.Receipts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptsRepository extends JpaRepository<Receipts, Long> {
}
