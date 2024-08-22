package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.PannelCourseMapDto;
import com.slotbooking.interviews.dto.PannelsDto;
import com.slotbooking.interviews.entity.Courses;
import com.slotbooking.interviews.entity.Pannels;
import com.slotbooking.interviews.repository.CoursesRepository;
import com.slotbooking.interviews.repository.PannelsRepository;
import com.slotbooking.interviews.service.PannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PannelServiceImpl implements PannelsService {

    @Autowired
    PannelsRepository pannelsRepository;

    @Autowired
    CoursesRepository  coursesRepository;
    @Override
    public List<Pannels> getPannels() {
        return pannelsRepository.findAll();
    }

    @Override
    public Pannels addPannels(PannelsDto pannelsDto) {
        Pannels pannel=Pannels.builder().panelName(pannelsDto.getPanelName()).build();
        return pannelsRepository.save(pannel);
    }

    @Override
    public Pannels mapPannelsAndCourse(PannelCourseMapDto pannels) {

        // check pannel present or not
        Optional<Pannels> pannel =pannelsRepository.findByPanelName(pannels.getPannelName());
        if(pannel.isPresent()){

            //check course exist or not
            Optional<Courses> course= coursesRepository.findByCourseName(pannels.getCouseName());

            if(course.isPresent()){
                // get pannel
                Pannels pannEn=pannel.get();
                // get existing course
               Set<Courses> setCou= pannEn.getCourses();

               // add new course
                setCou.add(course.get());


                pannEn.setCourses(setCou);

              Pannels pm=  pannelsRepository.save(pannEn);
                return pm;

            }

            return pannel.get();
        }
       else{
           return null;
        }
    }
}
