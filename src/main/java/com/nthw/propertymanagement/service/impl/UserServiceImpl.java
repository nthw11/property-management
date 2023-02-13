package com.nthw.propertymanagement.service.impl;

import com.nthw.propertymanagement.converter.UserConverter;
import com.nthw.propertymanagement.dto.UserDTO;
import com.nthw.propertymanagement.entity.UserEntity;
import com.nthw.propertymanagement.repository.UserRepository;
import com.nthw.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;
    @Override
    public UserDTO register(UserDTO userDTO) {

        UserEntity userEntity = userConverter.convertDTOtoEntity(userDTO);
        userRepository.save(userEntity);
        userDTO = userConverter.convertEntitytoDTO(userEntity);
        return userDTO;
    }

    @Override
    public UserDTO login(String email, String password) {
        return null;
    }
}
