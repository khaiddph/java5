package com.example.asm_java5.repository;

import com.example.asm_java5.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String>,ProductRepositoryCustom {

}
