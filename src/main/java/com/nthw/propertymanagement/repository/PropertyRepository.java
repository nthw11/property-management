package com.nthw.propertymanagement.repository;

import com.nthw.propertymanagement.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {
}
