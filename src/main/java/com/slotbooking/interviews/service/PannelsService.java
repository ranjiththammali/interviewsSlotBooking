package com.slotbooking.interviews.service;

import com.slotbooking.interviews.dto.PannelCourseMapDto;
import com.slotbooking.interviews.dto.PannelsDto;
import com.slotbooking.interviews.entity.Pannels;
import com.slotbooking.interviews.entity.Slot;

import java.util.List;

public interface PannelsService {
    List<Pannels> getPannels();
    Pannels addPannels(PannelsDto pannelsDto);

    Pannels mapPannelsAndCourse(PannelCourseMapDto pannels);

    Slot pannelsUpdateStatus(PannelsDto pannels);
}
