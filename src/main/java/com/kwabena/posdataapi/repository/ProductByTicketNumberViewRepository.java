package com.kwabena.posdataapi.repository;

import com.kwabena.posdataapi.model.ProductByTicketNumberView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductByTicketNumberViewRepository extends JpaRepository<ProductByTicketNumberView, Long> {

    public List<ProductByTicketNumberView> findByTicketnumber(String ticketnumber);
}
