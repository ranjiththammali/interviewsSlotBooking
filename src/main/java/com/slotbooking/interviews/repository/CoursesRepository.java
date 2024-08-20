package com.slotbooking.interviews.repository;
import com.slotbooking.interviews.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
    // Custom query methods can be defined here if needed
}
