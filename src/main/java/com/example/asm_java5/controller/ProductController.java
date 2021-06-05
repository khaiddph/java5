package com.example.asm_java5.controller;

import com.example.asm_java5.dto.request.ProductRequestDto;
import com.example.asm_java5.entity.Product;
import com.example.asm_java5.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping()
  public Product createProduct(@Valid @RequestBody ProductRequestDto createProduct) {
    return productService.createProduct(createProduct);
  }

  @PutMapping("/{id}")
  public Product updateProduct(@Valid @RequestBody ProductRequestDto updateProduct, @PathVariable("id") String id) {
    return productService.updateProduct(updateProduct, id);
  }

  @GetMapping("")
  public List<Product> getAllProduct() {
    return productService.getAllProduct();
  }

  @GetMapping("/{id}")
  public Product getProductById(@PathVariable("id") String id) {
    return productService.findById(id);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") String id) {
    productService.deleteProduct(id);
  }
}
