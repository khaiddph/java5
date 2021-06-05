package com.example.asm_java5.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductRequestDto {
  String product_title;
  String description;
  BigDecimal prince;
  int quantity;
  List<String> category;
}
