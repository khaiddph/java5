package com.example.asm_java5.service.serviceImp;

import com.example.asm_java5.dto.UserDto;
import com.example.asm_java5.dto.reponse.UserReponse;
import com.example.asm_java5.entity.EnumRole;
import com.example.asm_java5.entity.User;
import com.example.asm_java5.repository.UserRepository;
import com.example.asm_java5.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
  @Autowired
  UserRepository userRepository;

  @Override
  public UserDto createUser(UserDto createUser) {
    ModelMapper mapper = new ModelMapper();
    User user = mapper.map(createUser, User.class);
    LocalDate now = LocalDate.now();
    user.setCreate_date(now);
    user.setStatus(1);
    user.setRole(EnumRole.User);
    userRepository.save(user);
    return mapper.map(user, UserDto.class);
  }

  @Override
  public UserDto updateUser(String userId, UserDto updateUser) {
    ModelMapper mapper = new ModelMapper();
    User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("user not found" + userId));
    user.setEmail(updateUser.getEmail());
    user.setFull_name(updateUser.getFull_name());
    user.setPhone(updateUser.getPhone());
    user.setAddress(updateUser.getAddress());
    userRepository.save(user);
    return mapper.map(user, UserDto.class);
  }

  @Override
  public User findByUserName(String username) {
    return userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("user not found"));
  }

  @Override
  public void deleteUser(String userId) {
    User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("user not found" + userId));
    userRepository.deleteById(user.getUser_id());
  }

  @Override
  public List<User> getAll() {
    return userRepository.findAll();
  }

  @Override
  public UserReponse findById(String userId) {
    User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("user not found"));
    return new ModelMapper().map(user, UserReponse.class);
  }
}
