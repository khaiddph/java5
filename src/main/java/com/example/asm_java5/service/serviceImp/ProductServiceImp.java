package com.example.asm_java5.service.serviceImp;

import com.example.asm_java5.dto.request.ProductRequestDto;
import com.example.asm_java5.entity.Category;
import com.example.asm_java5.entity.Product;
import com.example.asm_java5.repository.CategoryRepository;
import com.example.asm_java5.repository.ProductRepository;
import com.example.asm_java5.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Service
public class ProductServiceImp implements ProductService {
  @Autowired
  private CategoryRepository categoryRepository;
  @Autowired
  private ProductRepository productRepository;
  @Override
  public Product createProduct(ProductRequestDto createProduct) {
    Product product =modelToEntity(createProduct,new Product());
    product.setProduct_id(UUID.randomUUID().toString());
    product.setCreate_date(LocalDate.now());
    return productRepository.save(product);
  }
  private Product modelToEntity(ProductRequestDto productRequestDto,Product product){
    product.setProduct_title(product.getProduct_title());
    product.setDescription(product.getDescription());
    product.setPrince(productRequestDto.getPrince());
    product.setQuantity(productRequestDto.getQuantity());
    List<Category> categories;
    categories=productRequestDto.getCategory().stream().map(categoryRepository::findByCategory_title).collect(Collectors.toList());
    product.setCategories(categories);
    return product;
  }

  @Override
  public Product updateProduct(ProductRequestDto updateProduct, String productId) {
    Product product=productRepository.findById(productId).orElseThrow(()-> new RuntimeException("product not found"));
    Product product1=modelToEntity(updateProduct,product);
    return productRepository.save(product1);
  }

  @Override
  public List<Product> getAllProduct() {
    return productRepository.findAll();
  }

  @Override
  public void deleteProduct(String productId) {
    Product product=productRepository.findById(productId).orElseThrow(()-> new RuntimeException("product not found"));
    productRepository.deleteById(product.getProduct_id());
  }

  @Override
  public Product findById(String productId) {
    return  productRepository.findById(productId).orElseThrow(()-> new RuntimeException("product not found"));

  }
}
