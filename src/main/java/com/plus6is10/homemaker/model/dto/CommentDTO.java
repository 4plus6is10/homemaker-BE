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
public class CommentDTO {
    private int commentSeq;
    private int postSeq;
    private String commenterEmail;
    private String commentContent;
    private Date commentDate;
}
