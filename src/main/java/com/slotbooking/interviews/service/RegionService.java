package com.slotbooking.interviews.service;

import com.slotbooking.interviews.dto.RegionsDto;
import com.slotbooking.interviews.entity.Regions;

import java.util.List;

public interface RegionService {
    List<Regions> getRegions();
    Regions addRegion(RegionsDto regionDto);
}
