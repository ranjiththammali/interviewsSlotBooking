package com.slotbooking.interviews.repository;

import com.slotbooking.interviews.entity.Pannels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PannelsRepository extends JpaRepository<Pannels, Long> {
    Optional<Pannels> findByPanelName(String pannelName);

}
