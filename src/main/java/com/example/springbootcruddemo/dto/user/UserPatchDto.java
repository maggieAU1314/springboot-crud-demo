package com.example.springbootcruddemo.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserPatchDto {
    @NotBlank
    @Size(max = 128, message = "Name can not be more than 128 characters.")
    private String name;
}
