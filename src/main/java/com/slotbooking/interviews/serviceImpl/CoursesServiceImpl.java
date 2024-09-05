package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.CourseDto;
import com.slotbooking.interviews.entity.Courses;
import com.slotbooking.interviews.repository.CoursesRepository;
import com.slotbooking.interviews.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    CoursesRepository coursesRepository;
    @Override
    public List<Courses> getCourses(){

        return coursesRepository.findAll();
    }

    @Override
    public Courses addCourse(CourseDto course) {

        Courses courses=new Courses();
        courses.setCourseName(course.getCourseName());
        return coursesRepository.save(courses);
    }
}
