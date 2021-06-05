package com.example.asm_java5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product extends baseEntity {
  @Id
  String product_id;
  String product_title;
  String description;
  BigDecimal prince;
  int quantity;
  String img_url;
  @ManyToMany
  @JoinTable(name = "category_product", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
  Collection<Category> categories;
}
