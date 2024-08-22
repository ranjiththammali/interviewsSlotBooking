package com.slotbooking.interviews.controllers;

import com.slotbooking.interviews.dto.PannelCourseMapDto;
import com.slotbooking.interviews.dto.PannelsDto;
import com.slotbooking.interviews.entity.Pannels;
import com.slotbooking.interviews.service.PannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1/")
public class PannelsControler {


    @Autowired
    private PannelsService pannelsService;

    @GetMapping("/pannels")
    public ResponseEntity<?> getPannels() {
        return new ResponseEntity<>(pannelsService.getPannels(), HttpStatus.OK);
    }

    @PostMapping("/pannels")
    public ResponseEntity<?> addPannels(@RequestBody PannelsDto pannels) {
        Pannels savedPannels = pannelsService.addPannels(pannels);
        return new ResponseEntity<>(savedPannels, HttpStatus.CREATED);
    }


    @PostMapping("/pannels/courses")
    public ResponseEntity<?> mapPannelsAndCourse(@RequestBody PannelCourseMapDto pannels) {
        Pannels savedPannels = pannelsService.mapPannelsAndCourse(pannels);
        return new ResponseEntity<>(savedPannels, HttpStatus.CREATED);
    }
}
