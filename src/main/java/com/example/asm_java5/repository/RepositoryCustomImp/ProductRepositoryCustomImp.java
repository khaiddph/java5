package com.example.asm_java5.repository.RepositoryCustomImp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProductRepositoryCustomImp {
  private static final String PRODUCT_ID = "product_id";
  private static final String PRODUCT_TITLE = "product_title";
  private static final String DESCRIPTION = "description";
  private static final String CREATED_DATE = "created_date";
  private static final String PRINCE="prince";
  private static final String QUANTITY="quantity";
  private static final String IMG_URL="img_url";
  @PersistenceContext
  private EntityManager entityManager;

}
