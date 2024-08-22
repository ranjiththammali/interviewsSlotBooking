package com.slotbooking.interviews.repository;
import com.slotbooking.interviews.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
    Optional<Courses> findByCourseName(String couseName);
}
