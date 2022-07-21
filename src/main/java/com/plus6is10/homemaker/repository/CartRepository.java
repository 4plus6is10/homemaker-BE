package com.plus6is10.homemaker.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.plus6is10.homemaker.model.dto.CartDTO;

@Mapper
public interface CartRepository {

    List<CartDTO> getAllCart();
    void insertCart(CartDTO cartDTO);
    int getAmount(String asin);
    void plusAmount(CartDTO cartDTO);
    void deleteCart(String asin);
    
}