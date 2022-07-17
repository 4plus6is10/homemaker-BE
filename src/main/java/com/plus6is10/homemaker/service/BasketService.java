package com.plus6is10.homemaker.service;

import java.util.List;

import com.plus6is10.homemaker.model.dto.BasketDTO;

public interface BasketService {
    
    void insertBasket(BasketDTO basketDTO);

    List<BasketDTO> getAllBaskets();

    void deleteBasket(String asin);

}