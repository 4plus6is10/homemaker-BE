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
    private String reviewerEmail;
    private String asin;
    private String reviewerName;
    private String reviewerNickname;
    private int overall;
    private String reviewContent;
    private Date reviewDate;
}
