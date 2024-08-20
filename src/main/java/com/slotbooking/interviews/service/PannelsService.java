package com.slotbooking.interviews.service;

import com.slotbooking.interviews.dto.PannelsDto;
import com.slotbooking.interviews.entity.Pannels;

import java.util.List;

public interface PannelsService {
    List<Pannels> getPannels();
    Pannels addPannels(PannelsDto pannelsDto);
}
