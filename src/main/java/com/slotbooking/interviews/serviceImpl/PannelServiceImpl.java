package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.PannelsDto;
import com.slotbooking.interviews.entity.Pannels;
import com.slotbooking.interviews.repository.PannelsRepository;
import com.slotbooking.interviews.service.PannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PannelServiceImpl implements PannelsService {

    @Autowired
    PannelsRepository pannelsRepository;
    @Override
    public List<Pannels> getPannels() {
        return pannelsRepository.findAll();
    }

    @Override
    public Pannels addPannels(PannelsDto pannelsDto) {
        Pannels pannel=Pannels.builder().panelName(pannelsDto.getPanelName()).build();
        return pannelsRepository.save(pannel);
    }
}
