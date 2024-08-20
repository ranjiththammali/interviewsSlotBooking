package com.slotbooking.interviews.service;

import com.slotbooking.interviews.dto.CourseDto;
import com.slotbooking.interviews.entity.Courses;

import java.util.List;

public interface CoursesService {
    List<Courses> getCourses();

    Courses addCourse(CourseDto course);
}
