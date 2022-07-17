package com.plus6is10.homemaker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plus6is10.homemaker.model.dto.CartDTO;
import com.plus6is10.homemaker.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public void insertCart(CartDTO cartDTO) {
        cartRepository.insertCart(cartDTO);
    }
    
    @Override
    public List<CartDTO> getAllCart() {
        List<CartDTO> cartList = cartRepository.getAllCart();
        return cartList;
    }

    @Override
    public void deleteCart(String asin) {
        cartRepository.deleteCart(asin);
        
    }
}
