package com.slotbooking.interviews.repository;

import com.slotbooking.interviews.entity.Pannels;
import com.slotbooking.interviews.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SlotRepository extends JpaRepository<Slot, Long> {
    Optional<Slot> findByPanel(Pannels pannels);
    // Custom query methods can be defined here if needed
}
