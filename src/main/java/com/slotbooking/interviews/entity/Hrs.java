package com.slotbooking.interviews.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Builder
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Hrs {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hr_name",unique = true,nullable = false)
    private String name;

    @OneToMany(mappedBy = "hrs",fetch = FetchType.LAZY)
    private Set<Pannels> pannels;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") // Foreign key column
    private User user;


}