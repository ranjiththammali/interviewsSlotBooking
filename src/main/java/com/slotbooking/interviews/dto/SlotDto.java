package com.slotbooking.interviews.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SlotDto {
    private LocalDateTime startTime; // Timestamp field
    private LocalDateTime endTime;   // Timestamp field
    private String day;
}
