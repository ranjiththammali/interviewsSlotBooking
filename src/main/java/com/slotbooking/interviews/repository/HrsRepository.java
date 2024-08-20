package com.slotbooking.interviews.repository;

import com.slotbooking.interviews.entity.Hrs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HrsRepository extends JpaRepository<Hrs, Long> {
    // Custom query methods can be defined here if needed
}
