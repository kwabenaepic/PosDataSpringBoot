package com.kwabena.posdataapi.repository;

import com.kwabena.posdataapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
