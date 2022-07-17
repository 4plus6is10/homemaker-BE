package com.plus6is10.homemaker.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plus6is10.homemaker.model.dto.BasketDTO;

@Mapper
public interface BasketRepository {

    void insertBasket(BasketDTO basketDTO);

    List<BasketDTO> getAllBaskets();

    void deleteBasket(String asin);
}
