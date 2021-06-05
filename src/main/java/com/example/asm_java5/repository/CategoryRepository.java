package com.example.asm_java5.repository;

import com.example.asm_java5.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
  Category findByCategory_title(String name);
}
