package com.nthw.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private Long id;
    private String ownerName;
    @NotNull(message = "Owner Email cannot be null")
    @NotEmpty(message = "Owner Email cannot be empty")
    @Size(min = 3, max = 50, message ="Owner Email must be between 3 and 50 characters")
    private String ownerEmail;
    private String phone;
    @NotNull(message = "Password cannot be null")
    @Size(min = 4, max = 100, message ="Password must be between 4 and 100 characters")
    @NotEmpty(message = "Password cannot be blank")
    private String password;
}
