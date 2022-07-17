package com.plus6is10.homemaker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plus6is10.homemaker.model.dto.BasketDTO;
import com.plus6is10.homemaker.repository.BasketRepository;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    BasketRepository basketRepository;

    @Override
    public void insertBasket(BasketDTO basketDTO) {
        basketRepository.insertBasket(basketDTO.getAsin(), basketDTO.getName(), basketDTO.getCategory(), basketDTO.getPrice(), basketDTO.getAmount());
    }
    
    
}
