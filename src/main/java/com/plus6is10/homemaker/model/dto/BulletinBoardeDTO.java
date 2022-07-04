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
public class BulletinBoardeDTO {
    private int postSeq;
    private String postEmail;
    private String postTitle;
    private String postContent;
    private Date postDate;
}
