package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.RegionsDto;
import com.slotbooking.interviews.entity.Regions;
import com.slotbooking.interviews.repository.RegionsRepository;
import com.slotbooking.interviews.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionsRepository regionsRepository;
    @Override
    public List<Regions> getRegions() {
        return regionsRepository.findAll();
    }

    @Override
    public Regions addRegion(RegionsDto regionDto) {
        Regions regoins=Regions.builder().stateName(regionDto.getStateName()).build();
        return regionsRepository.save(regoins);
    }
}
