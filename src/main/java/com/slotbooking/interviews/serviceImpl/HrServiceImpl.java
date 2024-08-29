package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.HrsDto;
import com.slotbooking.interviews.entity.Hrs;
import com.slotbooking.interviews.entity.Pannels;
import com.slotbooking.interviews.repository.HrsRepository;
import com.slotbooking.interviews.repository.PannelsRepository;
import com.slotbooking.interviews.service.HrServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class HrServiceImpl implements HrServices {

    @Autowired
    HrsRepository hrsRepository;

    @Autowired
    PannelsRepository pannelsRepository;
    @Override
    public List<Hrs> getHrList() {
        return hrsRepository.findAll();
    }

    @Override
    public Hrs addHrs(HrsDto hrs) {

        Hrs hr=Hrs.builder().name(hrs.getName()).build();
        return hrsRepository.save(hr);
    }

    @Override
    public Hrs addHrsAndPannel(HrsDto hrs) {

        AtomicReference<Hrs> hrEn= new AtomicReference<>(new Hrs());
// find the hrs
      /* Optional<Hrs> hrsEn = hrsRepository.findByName(hrs.getName());

        Optional<Pannels> panEn=pannelsRepository.findByPanelName(hrs.getPannelName());

        if(hrsEn.isPresent() && panEn.isPresent()){
          Pannels pn=  panEn.get();
          pn.setHrs(hrsEn.get());
            pannelsRepository.save(pn);
        }
*/
        return hrsRepository.findByName(hrs.getName()).get();

    }
}
