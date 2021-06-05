package com.example.asm_java5.dto.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserReponse {
  String user_id;
  String password;
  String username;
  String full_name;
  String phone;
  String address;
  LocalDate createdDate;
  int status;
  String email;
}
