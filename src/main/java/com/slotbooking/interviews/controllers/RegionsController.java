package com.slotbooking.interviews.controllers;

import com.slotbooking.interviews.dto.RegionsDto;
import com.slotbooking.interviews.entity.Regions;
import com.slotbooking.interviews.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1/")
public class RegionsController {


    @Autowired
    private RegionService regionsService;

    @GetMapping("/regions")
    public ResponseEntity<?> getRegions() {
        return new ResponseEntity<>(regionsService.getRegions(), HttpStatus.OK);
    }

    @PostMapping("/regions")
    public ResponseEntity<?> addRegion(@RequestBody RegionsDto region) {
        Regions savedRegion = regionsService.addRegion(region);
        return new ResponseEntity<>(savedRegion, HttpStatus.CREATED);
    }
}

