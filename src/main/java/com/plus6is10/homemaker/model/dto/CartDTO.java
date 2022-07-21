package com.plus6is10.homemaker.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private int seq;
    private String asin;
    private String name;
    private String category;
    private float price;
    private int amount;

}