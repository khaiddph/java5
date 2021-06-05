package com.example.asm_java5.controller;

import com.example.asm_java5.dto.UserDto;
import com.example.asm_java5.dto.reponse.UserReponse;
import com.example.asm_java5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/use")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("")
  public List<UserDto> getAllUser() {
    return userService.getAll();
  }

  @GetMapping("/{id}")
  public UserReponse getUserById(@PathVariable("id") String userId) {
    return userService.findById(userId);
  }

  @PostMapping("")
  public UserDto createUser(@Valid @RequestBody UserDto userDto) {
    return userService.createUser(userDto);
  }

  @PutMapping("/{id}")
  public UserDto updateUser(@PathVariable("id") String userId, @Valid @RequestBody UserDto userDto) {
    return userService.updateUser(userId, userDto);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable("id") String userId) {
    userService.deleteUser(userId);
  }
}
