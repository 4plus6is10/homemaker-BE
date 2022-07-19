package com.plus6is10.homemaker.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plus6is10.homemaker.model.dto.CartDTO;

@Mapper
public interface CartRepository {

    void insertCart(CartDTO cartDTO);
    List<CartDTO> getAllCart();
    void deleteCart(String asin);
    
}
