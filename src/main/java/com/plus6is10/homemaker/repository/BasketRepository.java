package com.plus6is10.homemaker.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BasketRepository {

    void insertBasket(String asin, String name, String category, float price, int amount);

}
