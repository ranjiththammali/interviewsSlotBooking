package com.slotbooking.interviews.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "course_name",unique = true,nullable = false)
    private String courseName;

    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
    private Set<Pannels> pannels;

}