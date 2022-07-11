package com.plus6is10.homemaker.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private int seq;
    private String name;
    private String asin;
    private Float price;
    private String buyLink;
    private String imgLink;
    private String category;
}
