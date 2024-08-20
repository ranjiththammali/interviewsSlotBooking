package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.SlotDto;
import com.slotbooking.interviews.entity.Slot;
import com.slotbooking.interviews.repository.SlotRepository;
import com.slotbooking.interviews.service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlotServiceImpl implements SlotService {

    @Autowired
    SlotRepository slotRepository;
    @Override
    public List<Slot> getSlots() {
        return slotRepository.findAll();
    }

    @Override
    public Slot addSlot(SlotDto slotDto) {
        Slot slot=Slot.builder().startTime(slotDto.getStartTime()).endTime(slotDto.getEndTime()).day(slotDto.getDay()).build();
        return slotRepository.save(slot);
    }
}
