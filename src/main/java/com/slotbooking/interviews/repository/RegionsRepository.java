package com.slotbooking.interviews.repository;

import com.slotbooking.interviews.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionsRepository extends JpaRepository<Regions, Long> {
    // Custom query methods can be defined here if needed
}
