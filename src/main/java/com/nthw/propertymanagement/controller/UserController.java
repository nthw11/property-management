package com.nthw.propertymanagement.controller;

import com.nthw.propertymanagement.dto.UserDTO;
import com.nthw.propertymanagement.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "register", notes = "register a new user")
    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@ApiParam(
            name = "userDTO",
            type = "UserDTO",
            value = "User data",
            example = "user information",
            required = true
    ) @Valid @RequestBody UserDTO userDTO){

        userDTO = userService.register(userDTO);

        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);

    }
    @PostMapping( path = "/login", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<UserDTO> login(@RequestBody UserDTO userDTO){
        userDTO = userService.login(userDTO.getOwnerEmail(), userDTO.getPassword() );
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

}
