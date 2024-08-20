package com.slotbooking.interviews.controllers;

import com.slotbooking.interviews.dto.CourseDto;
import com.slotbooking.interviews.entity.Courses;
import com.slotbooking.interviews.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1/")
public class CoursesController {


    @Autowired
    CoursesService coursesService;

    @GetMapping("/courses")
    ResponseEntity<?> courses(){

        return  new ResponseEntity<>(coursesService.getCourses(), HttpStatus.OK);
    }

    @PostMapping("/courses")
    public ResponseEntity<?> addCourse(@RequestBody CourseDto course) {
        Courses savedCourse = coursesService.addCourse(course);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }
}
