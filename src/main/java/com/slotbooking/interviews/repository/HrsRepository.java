package com.slotbooking.interviews.repository;

import com.slotbooking.interviews.entity.Hrs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HrsRepository extends JpaRepository<Hrs, Long> {
    Optional<Hrs> findByName(String name);
    // Custom query methods can be defined here if needed
}
