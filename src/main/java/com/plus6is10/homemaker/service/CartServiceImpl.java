package com.plus6is10.homemaker.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.plus6is10.homemaker.repository.CartRepository;
import com.plus6is10.homemaker.model.dto.CartDTO;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public List<CartDTO> getAllCart() {
        List<CartDTO> cartList = cartRepository.getAllCart();
        return cartList;
    }

    @Override
    public void insertCart(CartDTO cartDTO) {
        String asin = cartDTO.getAsin();
        int amount = cartRepository.getAmount(asin);

        if(amount >= 1) {
            cartRepository.plusAmount(cartDTO);
        } else {
            cartRepository.insertCart(cartDTO);
        }
    }

    @Override
    public void deleteCart(String asin) {
        cartRepository.deleteCart(asin);
    }

}