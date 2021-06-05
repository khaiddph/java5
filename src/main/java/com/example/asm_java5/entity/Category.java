package com.example.asm_java5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Category extends baseEntity {
  @Id
  String category_id;
  String category_title;
  @ManyToMany(mappedBy = "category_id",fetch = FetchType.EAGER)
  Collection<Product> products;
}
