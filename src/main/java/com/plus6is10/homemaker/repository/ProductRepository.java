package com.plus6is10.homemaker.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
// import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
// import org.springframework.web.bind.annotation.RequestParam;

import com.plus6is10.homemaker.model.dto.ProductDTO;

@Mapper
public interface ProductRepository {
    
    @Select("SELECT * FROM product")
    List<ProductDTO> getAllProducts();

    @Select("SELECT * FROM product WHERE name = #{name}")
    ProductDTO getOneProduct(String name);
    // RequestParam("name")

    @Select("SELECT * FROM product WHERE category = #{category}")
    List<ProductDTO> getProductsByCategory(String category);
    
}
