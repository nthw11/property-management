package com.nthw.propertymanagement.service;

import com.nthw.propertymanagement.dto.UserDTO;

public interface UserService {

    UserDTO register(UserDTO userDTO);
    UserDTO login(String email, String password);
}
