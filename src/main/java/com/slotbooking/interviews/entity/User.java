package com.slotbooking.interviews.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor
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