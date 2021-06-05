package com.example.asm_java5.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    @NotBlank
    String username;
    @NotBlank
    String password;
}
