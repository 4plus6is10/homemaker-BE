package com.plus6is10.homemaker.service;

import java.util.List;

import com.plus6is10.homemaker.model.dto.RecommendedProductDTO;

public interface RecommendedProductService {

    List<RecommendedProductDTO> getRecommendedProducts(String searchedAsin);
    // String getRecommendedProducts(String searchedAsin);
    
}
