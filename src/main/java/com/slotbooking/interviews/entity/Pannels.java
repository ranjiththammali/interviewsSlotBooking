package com.slotbooking.interviews.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Builder
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)

@NoArgsConstructor
@AllArgsConstructor
public class Pannels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "panel_name",unique = true,nullable = false)
    private String panelName;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Courses> courses;

  /*  @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hr_id")
    private Hrs hrs;*/
}