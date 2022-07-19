package com.plus6is10.homemaker.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {
    
    private int seq;
    private String asin;
    private String name;
    private Date review_date;
    private int rating;
    private String review_title;
    private String review_content;
    
}
