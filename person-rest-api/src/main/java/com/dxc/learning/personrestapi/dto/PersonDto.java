package com.dxc.learning.personrestapi.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;


import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "DOB cannot be null")
    private LocalDate dob;

    @NotBlank(message = "Address cannot be empty")
    private String address;

    @NotBlank(message = "Email cannot be empty")
    private String email;

    @NotBlank(message = "user password is mandatory")
    @Size(min = 4, max = 20, message = "password size must be in between 4 and 20")
    private String password;

}