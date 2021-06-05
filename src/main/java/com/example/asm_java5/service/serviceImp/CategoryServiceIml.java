package com.example.asm_java5.service.serviceImp;

import com.example.asm_java5.dto.request.CategoryRequest;
import com.example.asm_java5.entity.Category;
import com.example.asm_java5.repository.CategoryRepository;
import com.example.asm_java5.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CategoryServiceIml implements CategoryService {
  @Autowired
  private CategoryRepository categoryRepository;
  @Override
  public Category createdCategory(CategoryRequest createdCategory) {
    ModelMapper modelMapper=new ModelMapper();
    Category category=modelMapper.map(createdCategory,Category.class);
    category.setCategory_id(UUID.randomUUID().toString());
    category.setCreate_date(LocalDate.now());
    categoryRepository.save(category);
    return category;
  }

  @Override
  public Category updateCategory(CategoryRequest updateCategory, String categoryId) {
    Category category=categoryRepository.findById(categoryId).orElseThrow(()-> new RuntimeException("category not found"));
    category.setCategory_title(updateCategory.getCategory_title());
    category.setUpdate_last(LocalDate.now());
    return categoryRepository.save(category);
  }

  @Override
  public List<Category> getAllCategory() {
    return categoryRepository.findAll();
  }

  @Override
  public Category getCategoryById(String category_id) {
    return categoryRepository.findById(category_id).orElseThrow(()-> new RuntimeException("category not found"));
  }

  @Override
  public void deleteCategory(String categoryId) {
    Category category=categoryRepository.findById(categoryId).orElseThrow(()-> new RuntimeException("category not found"));
    categoryRepository.deleteById(category.getCategory_id());
  }
}
