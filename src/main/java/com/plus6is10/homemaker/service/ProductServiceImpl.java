package com.plus6is10.homemaker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.plus6is10.homemaker.model.dto.ProductDTO;
import com.plus6is10.homemaker.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    ProductRepository productRepository;
    
    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> productList = productRepository.getAllProducts();
        return productList;

    }
    
    @Override
    public ProductDTO getOneProduct(String name) {
        ProductDTO product = productRepository.getOneProduct(name);
        return product;
    }
    
    @Override
    public List<ProductDTO> getProductsByCategory(String category) {
        List<ProductDTO> productListCategory = productRepository.getProductsByCategory(category);
        return productListCategory;
    }

}
