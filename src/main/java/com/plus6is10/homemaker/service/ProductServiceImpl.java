package com.plus6is10.homemaker.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.plus6is10.homemaker.repository.ProductRepository;
import com.plus6is10.homemaker.model.dto.ProductDTO;

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
    public List<ProductDTO> getProductsByName(String name) {
        List<ProductDTO> productList = productRepository.getProductsByName(name);
        return productList;
    }

    @Override
    public List<ProductDTO> getProductsByAsin(String asin) {
        List<ProductDTO> productList = productRepository.getProductsByAsin(asin);
        return productList;
    }
    
    @Override
    public List<ProductDTO> getProductsByCategory(String category) {
        List<ProductDTO> productList = productRepository.getProductsByCategory(category);
        return productList;
    }
    
    @Override
    public List<ProductDTO> getProductsByKeyword(String keyword) {
        List<ProductDTO> productList = productRepository.getProductsByKeyword(keyword);
        return productList;
    }

}