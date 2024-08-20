package com.slotbooking.interviews.repository;

import com.slotbooking.interviews.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot, Long> {
    // Custom query methods can be defined here if needed
}
