package com.plus6is10.homemaker.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RecommendedProductDTO {
    
    private String searched_asin;
    private String asin;
    private String name;
    private float price;
    private String buylink;
    private String imglink;
    private String category;

}
