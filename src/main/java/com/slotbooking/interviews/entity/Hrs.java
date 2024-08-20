package com.slotbooking.interviews.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
@Builder
@Data
@Entity
public class Hrs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hr_name",unique = true,nullable = false)
    private String name;

    @OneToMany(mappedBy = "hrs")
    private Set<Pannels> pannels;

    @OneToOne
    @JoinColumn(name = "user_id") // Foreign key column
    private User user;


}