package com.example.asm_java5.controller;

import com.example.asm_java5.dto.request.CategoryRequest;
import com.example.asm_java5.entity.Category;
import com.example.asm_java5.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
  @Autowired
  private CategoryService categoryService;

  @PostMapping("")
  public Category createCategory(@Valid @RequestBody CategoryRequest categoryRequest) {
    return categoryService.createdCategory(categoryRequest);
  }

  @PutMapping("/{category_id}")
  public Category updateCategory(@Valid @RequestBody CategoryRequest categoryRequest, @PathVariable("category_id") String category_id) {
    return categoryService.updateCategory(categoryRequest, category_id);
  }

  @GetMapping("")
  public List<Category> getCategory() {
    return categoryService.getAllCategory();
  }

  @GetMapping("/{category_id}")
  public Category getCategoryById(@PathVariable("category_id") String category_id) {
    return categoryService.getCategoryById(category_id);
  }

  @DeleteMapping("/{category_id}")
  public void deleteCategory(@PathVariable("category_id") String category_id) {
    categoryService.deleteCategory(category_id);
  }

}
