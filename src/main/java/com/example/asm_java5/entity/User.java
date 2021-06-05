package com.example.asm_java5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends baseEntity {
    @Id
    String user_id;
    String password;
    String username;
    String full_name;
    String phone;
    String address;
    @Enumerated(EnumType.STRING)
    EnumRole role;
    int status;
    String email;
}
