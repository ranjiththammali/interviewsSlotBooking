package com.slotbooking.interviews.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)

@NoArgsConstructor
@AllArgsConstructor
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