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
    private int reviewSeq;
    private String asin;
    private String name;
    private Date reviewDate;
    private int rating;
    private String reviewTitle;
    private String reviewContent;
}
