package com.example.asm_java5.service;

import com.example.asm_java5.dto.request.CategoryRequest;
import com.example.asm_java5.entity.Category;

import java.util.List;

public interface CategoryService {
  Category createdCategory(CategoryRequest createdCategory);
  Category updateCategory(CategoryRequest updateCategory ,String categoryId);
  List<Category> getAllCategory();
  Category getCategoryById(String category_id);
  void deleteCategory(String categoryId);

}
