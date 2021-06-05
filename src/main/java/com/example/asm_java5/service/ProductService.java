package com.example.asm_java5.service;

import com.example.asm_java5.dto.request.CategoryRequest;
import com.example.asm_java5.dto.request.ProductRequestDto;
import com.example.asm_java5.entity.Product;

import java.util.List;

public interface ProductService {
  Product createProduct(ProductRequestDto createProduct);
  Product updateProduct(ProductRequestDto updateProduct,String productId);
  List<Product> getAllProduct();
  void deleteProduct(String productId);
  Product findById(String productId);
}
