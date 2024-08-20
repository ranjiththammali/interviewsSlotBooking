package com.slotbooking.interviews.controllers;

import com.slotbooking.interviews.dto.SlotDto;
import com.slotbooking.interviews.entity.Slot;
import com.slotbooking.interviews.service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1/")
public class SlotController {


    @Autowired
    private SlotService slotService;

    @GetMapping("/slots")
    public ResponseEntity<?> getSlots() {
        return new ResponseEntity<>(slotService.getSlots(), HttpStatus.OK);
    }

    @PostMapping("/slots")
    public ResponseEntity<?> addSlot(@RequestBody SlotDto slot) {
        Slot savedSlot = slotService.addSlot(slot);
        return new ResponseEntity<>(savedSlot, HttpStatus.CREATED);
    }
}
