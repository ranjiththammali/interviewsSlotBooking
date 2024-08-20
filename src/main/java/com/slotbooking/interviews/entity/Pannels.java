package com.slotbooking.interviews.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Builder
@Data
@Entity
public class Pannels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "panel_name",unique = true,nullable = false)
    private String panelName;

    @ManyToMany
    private Set<Courses> courses;

    @ManyToOne
    private Hrs hrs;

}