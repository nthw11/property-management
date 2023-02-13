package com.nthw.propertymanagement.converter;

import com.nthw.propertymanagement.dto.UserDTO;
import com.nthw.propertymanagement.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity convertDTOtoEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setOwnerEmail(userDTO.getOwnerEmail());
        userEntity.setOwnerName(userDTO.getOwnerName());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setPhone(userDTO.getPhone());
        return userEntity;
    }

    public UserDTO convertEntitytoDTO(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setOwnerEmail(userEntity.getOwnerEmail());
        userDTO.setId(userEntity.getId());
        userDTO.setOwnerName(userEntity.getOwnerName());
        userDTO.setPhone(userEntity.getPhone());
        return userDTO;
    }
}
