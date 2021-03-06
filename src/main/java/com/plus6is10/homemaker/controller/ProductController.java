package com.plus6is10.homemaker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plus6is10.homemaker.model.dto.ProductDTO;
import com.plus6is10.homemaker.service.ProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;
   
    @GetMapping()
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/name")
    public List<ProductDTO> getProductsByName(@RequestParam String name) {
        return productService.getProductsByName(name);
    }

    @GetMapping("/asin")
    public List<ProductDTO> getProductsByAsin(@RequestParam String asin) {
        return productService.getProductsByAsin(asin);
    }

    @GetMapping("/category")
    public List<ProductDTO> getProductsByCategory(@RequestParam String category) {
        return productService.getProductsByCategory(category);
    }

    @GetMapping("/keyword")
    public List<ProductDTO> getProductsByKeyword(@RequestParam String keyword) {
        return productService.getProductsByKeyword(keyword);
    }

}
