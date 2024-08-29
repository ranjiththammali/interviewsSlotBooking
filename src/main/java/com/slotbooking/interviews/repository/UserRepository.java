package com.slotbooking.interviews.repository;
import com.slotbooking.interviews.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String userName);
    // Custom query methods can be defined here if needed
}