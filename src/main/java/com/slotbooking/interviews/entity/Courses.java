package com.slotbooking.interviews.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)

@NoArgsConstructor
@AllArgsConstructor
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "course_name",unique = true,nullable = false)
    private String courseName;


    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private Set<Pannels> pannels;

}