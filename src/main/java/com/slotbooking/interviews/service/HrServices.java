package com.slotbooking.interviews.service;

import com.slotbooking.interviews.dto.HrsDto;
import com.slotbooking.interviews.entity.Courses;
import com.slotbooking.interviews.entity.Hrs;

import java.util.List;

public interface HrServices {
    List<Hrs> getHrList();

    Hrs addHrs(HrsDto hrs);

    Hrs addHrsAndPannel(HrsDto hrs);
}
