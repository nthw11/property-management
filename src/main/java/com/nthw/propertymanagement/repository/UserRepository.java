package com.nthw.propertymanagement.repository;

import com.nthw.propertymanagement.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
