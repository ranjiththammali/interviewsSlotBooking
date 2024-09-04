package com.slotbooking.interviews.controllers;

import com.slotbooking.interviews.dto.CourseDto;
import com.slotbooking.interviews.entity.Courses;
import com.slotbooking.interviews.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/v1/")
public class CoursesController {

    private final CoursesService coursesService;

    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Courses>> getCourses() {
        List<Courses> courses = coursesService.getCourses();
        return ResponseEntity.ok(courses);
    }

    @PostMapping("/courses")
    public ResponseEntity<Courses> addCourse(@RequestBody CourseDto course) {
        Courses savedCourse = coursesService.addCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCourse);
    }
}
