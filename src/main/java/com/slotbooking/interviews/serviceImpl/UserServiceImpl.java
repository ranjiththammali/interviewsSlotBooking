package com.slotbooking.interviews.serviceImpl;

import com.slotbooking.interviews.dto.UserDto;
import com.slotbooking.interviews.entity.User;
import com.slotbooking.interviews.repository.UserRepository;
import com.slotbooking.interviews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(UserDto userDto) {

        User use=User.builder().email(userDto.getEmail()).username(userDto.getUsername()).build();

        return userRepository.save(use);
    }
}
