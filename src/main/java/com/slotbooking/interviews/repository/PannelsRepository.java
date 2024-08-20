package com.slotbooking.interviews.repository;

import com.slotbooking.interviews.entity.Pannels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PannelsRepository extends JpaRepository<Pannels, Long> {
    // Custom query methods can be defined here if needed
}
