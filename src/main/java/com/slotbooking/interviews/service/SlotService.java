package com.slotbooking.interviews.service;

import com.slotbooking.interviews.dto.SlotDto;
import com.slotbooking.interviews.entity.Slot;

import java.util.List;

public interface SlotService {

    List<Slot> getSlots();
    Slot addSlot(SlotDto slotDto);
}
