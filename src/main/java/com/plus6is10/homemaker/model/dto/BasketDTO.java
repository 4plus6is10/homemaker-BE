package com.plus6is10.homemaker.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasketDTO {

    private int seq;
    private String asin;
    private String name;
    private String category;
    private float price;
    private int amount;

}
