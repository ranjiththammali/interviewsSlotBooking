package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.HrsDto;
import com.slotbooking.interviews.entity.Courses;
import com.slotbooking.interviews.entity.Hrs;
import com.slotbooking.interviews.repository.HrsRepository;
import com.slotbooking.interviews.service.HrServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrServiceImpl implements HrServices {

    @Autowired
    HrsRepository hrsRepository;
    @Override
    public List<Hrs> getHrList() {
        return hrsRepository.findAll();
    }

    @Override
    public Hrs addHrs(HrsDto hrs) {

        Hrs hr=Hrs.builder().name(hrs.getName()).build();
        return hrsRepository.save(hr);
    }
}
