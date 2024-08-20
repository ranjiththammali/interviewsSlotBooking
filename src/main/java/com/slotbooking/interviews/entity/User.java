package com.slotbooking.interviews.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",unique = true,nullable = false,updatable = false)
    private String username;
    @Column(name = "email",unique = true,nullable = false,updatable = false)
    private String email;

    @OneToOne(mappedBy = "user")
    private Hrs hrs;
}