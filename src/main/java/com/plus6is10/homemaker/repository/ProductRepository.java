package com.plus6is10.homemaker.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.plus6is10.homemaker.model.dto.ProductDTO;
import com.plus6is10.homemaker.model.dto.RecommendedProductDTO;

@Mapper
public interface ProductRepository {

    List<ProductDTO> getAllProducts();

    List<ProductDTO> getProductsByName(String name);  // Param("name")

    List<ProductDTO> getProductsByAsin(String asin);

    List<ProductDTO> getProductsByCategory(String category);

    List<ProductDTO> getProductsByKeyword(String keyword);
    
    List<RecommendedProductDTO> getRecommendedProducts(String searchedAsin);

}
