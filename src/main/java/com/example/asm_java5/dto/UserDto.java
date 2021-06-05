package com.example.asm_java5.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
  @NotBlank
  String username;
  @NotBlank
  String password;
  @NotBlank
  String full_name;
  @Email
  String email;
  @NotBlank
  String phone;
  @NotBlank
  String address;
}
