package com.plus6is10.homemaker.service;

import java.util.List;

import com.plus6is10.homemaker.model.dto.CartDTO;

public interface CartService {
    
    void insertCart(CartDTO basketDTO);

    List<CartDTO> getAllCart();

    void deleteCart(String asin);

}