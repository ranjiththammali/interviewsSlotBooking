package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.SlotDto;
import com.slotbooking.interviews.entity.Slot;
import com.slotbooking.interviews.repository.HrsRepository;
import com.slotbooking.interviews.repository.PannelsRepository;
import com.slotbooking.interviews.repository.SlotRepository;
import com.slotbooking.interviews.repository.UserRepository;
import com.slotbooking.interviews.service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class SlotServiceImpl implements SlotService {

    @Autowired
    SlotRepository slotRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PannelsRepository pannelsRepository;

    @Autowired
    HrsRepository hrsRepository;

    @Override
    public List<Slot> getSlots() {
        return slotRepository.findAll();
    }

    @Override
    public Slot addSlot(SlotDto slotDto) {

        var user=userRepository.findByUsername(slotDto.getUserName());
       var pannel= pannelsRepository.findByPanelName(slotDto.getPanelName());
      var hrs=  hrsRepository.findByName(slotDto.getHrsName());

      if(user.isPresent() && pannel.isPresent() && hrs.isPresent()){

          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

          // The date-time string to be parsed
          String dateTimeString = slotDto.getStartTime();
          String endTimeString = slotDto.getEndTime();

          // Parse the string to LocalDateTime
          LocalDateTime startTime = LocalDateTime.parse(dateTimeString, formatter);
          LocalDateTime endTime = LocalDateTime.parse(endTimeString, formatter);

          Slot slot=Slot.builder().startTime(startTime).endTime(endTime).day(slotDto.getDay()).user(user.get()).panel(pannel.get()).hrs(hrs.get()).build();
          return slotRepository.save(slot);
      }
       return new Slot();
    }
}
