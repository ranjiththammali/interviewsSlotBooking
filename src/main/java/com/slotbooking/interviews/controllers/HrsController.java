package com.slotbooking.interviews.controllers;

import com.slotbooking.interviews.dto.CourseDto;
import com.slotbooking.interviews.dto.HrsDto;
import com.slotbooking.interviews.entity.Courses;
import com.slotbooking.interviews.entity.Hrs;
import com.slotbooking.interviews.service.CoursesService;
import com.slotbooking.interviews.service.HrServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1/")
public class HrsController {


    @Autowired
    HrServices hrServices;

    @GetMapping("/hrs")
    ResponseEntity<?> courses(){

        return  new ResponseEntity<>(hrServices.getHrList(), HttpStatus.OK);
    }

    @PostMapping("/hrs")
    public ResponseEntity<?> addHrs(@RequestBody HrsDto hrs) {
        Hrs savedHrs = hrServices.addHrs(hrs);
        return new ResponseEntity<>(savedHrs, HttpStatus.CREATED);
    }

    @PostMapping("/hrs/pannel")
    public ResponseEntity<?> addHrsAndPannel(@RequestBody HrsDto hrs) {
        Hrs savedHrs = hrServices.addHrsAndPannel(hrs);
        return new ResponseEntity<>(savedHrs, HttpStatus.CREATED);
    }
}
