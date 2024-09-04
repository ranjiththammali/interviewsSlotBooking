package com.slotbooking.interviews.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String day;
    private Boolean interviewDone;
    private String selection;

    @ManyToOne
    private Pannels panel;

    @ManyToOne
    private Hrs hrs;

    @ManyToOne
    private User user;
}