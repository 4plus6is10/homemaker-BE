package com.plus6is10.homemaker.service;

import java.util.List;

import com.plus6is10.homemaker.model.dto.ProductDTO;

public interface ProductService {
  
    List<ProductDTO> getAllProducts();
    ProductDTO getOneProduct(String name);
    List<ProductDTO> getProductsByCategory(String category);
    List<ProductDTO> getProductsByKeyword(String keyword);
    
}
