package com.plus6is10.homemaker.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plus6is10.homemaker.model.dto.ReviewDTO;

@Mapper
public interface ReviewRepository {
    List<ReviewDTO> getAllReviews();
}
