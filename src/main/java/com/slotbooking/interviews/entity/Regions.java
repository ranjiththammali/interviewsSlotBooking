package com.slotbooking.interviews.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)

@NoArgsConstructor
@AllArgsConstructor
public class Regions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state",unique = true,nullable = false)
    private String stateName;
}