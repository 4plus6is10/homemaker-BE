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
    private int basketSeq;
    private String basketEmail;
    private String asin;
    private Long price;
    private int amount;
    private Long totalPrice;
}
