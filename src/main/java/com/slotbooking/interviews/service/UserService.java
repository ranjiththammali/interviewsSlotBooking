package com.slotbooking.interviews.service;

import com.slotbooking.interviews.dto.UserDto;
import com.slotbooking.interviews.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User addUser(UserDto userDto);
}
