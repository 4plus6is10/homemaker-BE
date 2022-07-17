package com.plus6is10.homemaker.service;

import java.util.List;

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
        basketRepository.insertBasket(basketDTO);
    }
    
    @Override
    public List<BasketDTO> getAllBaskets() {
        List<BasketDTO> basketList = basketRepository.getAllBaskets();
        return basketList;
    }

    @Override
    public void deleteBasket(String asin) {
        basketRepository.deleteBasket(asin);
        
    }
}
