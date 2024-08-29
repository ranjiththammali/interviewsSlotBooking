package com.slotbooking.interviews.dto;

import com.slotbooking.interviews.entity.Hrs;
import com.slotbooking.interviews.entity.Pannels;
import com.slotbooking.interviews.entity.User;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SlotDto {
    private String startTime; // Timestamp field
    private String endTime;   // Timestamp field
    private String day;


    private String panelName;

    private String hrsName;

    private String userName;
}
