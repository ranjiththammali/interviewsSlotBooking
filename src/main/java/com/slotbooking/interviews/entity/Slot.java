package com.slotbooking.interviews.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Builder
@Data
@Entity
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime; // Timestamp field
    private LocalDateTime endTime;   // Timestamp field
    private String day;

    @ManyToOne
    private Pannels panel;
    @ManyToOne
    private Hrs hrs;
    @ManyToOne
    private User user;
}