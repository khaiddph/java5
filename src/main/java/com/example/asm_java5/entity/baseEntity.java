package com.example.asm_java5.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public abstract class baseEntity {
  LocalDate create_date;
  LocalDate update_last;
}
