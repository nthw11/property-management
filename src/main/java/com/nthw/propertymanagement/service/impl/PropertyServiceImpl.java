package com.nthw.propertymanagement.service.impl;

import com.nthw.propertymanagement.dto.PropertyDTO;
import com.nthw.propertymanagement.entity.PropertyEntity;
import com.nthw.propertymanagement.repository.PropertyRepository;
import com.nthw.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {

        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setDescription(propertyDTO.getDescription());
        pe.setAddress(propertyDTO.getAddress());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setPrice(propertyDTO.getPrice());
        propertyRepository.save(pe);
        return null;
    }
}
