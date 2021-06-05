package com.example.asm_java5.service;


import com.example.asm_java5.dto.UserDto;
import com.example.asm_java5.dto.reponse.UserReponse;
import com.example.asm_java5.entity.User;

import java.util.List;

public interface UserService {
  UserDto createUser(UserDto createUser);

  UserDto updateUser(String userId, UserDto updateUser);

  User findByUserName(String username);

  void deleteUser(String userId);

  List<User> getAll();

  UserReponse findById(String userId);
}
