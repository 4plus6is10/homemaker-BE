package com.plus6is10.homemaker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plus6is10.homemaker.model.dto.RecommendedProductDTO;
import com.plus6is10.homemaker.repository.ProductRepository;
import com.plus6is10.homemaker.repository.ReviewRepository;

@Service
public class RecommendedProductServiceImpl implements RecommendedProductService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<RecommendedProductDTO> getRecommendedProducts(String searchedAsin) {
        List<RecommendedProductDTO> productList = productRepository.getRecommendedProducts(searchedAsin);
        return productList;
    }

}
