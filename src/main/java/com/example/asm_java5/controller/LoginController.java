package com.example.asm_java5.controller;

import com.example.asm_java5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
  @Autowired
  private UserService userService;
}
