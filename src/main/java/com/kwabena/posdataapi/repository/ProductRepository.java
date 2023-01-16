package com.kwabena.posdataapi.repository;

import com.kwabena.posdataapi.entity.ProductEntity;
import com.kwabena.posdataapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByName(String name);

    // define custom funtions not present in default spring JPA
    public List<Product> findByDescription(String description);

    //Custom querries
    @Query(value = "select * from Product p where p.description=:description", nativeQuery = true)
    public List<Product> findDescription(String description  );
}
