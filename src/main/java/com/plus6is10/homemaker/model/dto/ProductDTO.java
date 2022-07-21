package com.plus6is10.homemaker.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private int seq;
    private String name;
    private String asin;
    private float price;
    private String buylink;
    private String imglink;
    private String category;

}