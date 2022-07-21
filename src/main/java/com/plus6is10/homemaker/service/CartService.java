package com.plus6is10.homemaker.service;

import java.util.List;
import com.plus6is10.homemaker.model.dto.CartDTO;

public interface CartService {
    
    List<CartDTO> getAllCart();
    void insertCart(CartDTO cartDTO);
    void deleteCart(String asin);

}