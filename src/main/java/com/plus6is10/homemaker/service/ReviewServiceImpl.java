package com.plus6is10.homemaker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.plus6is10.homemaker.model.dto.ReviewDTO;
import com.plus6is10.homemaker.repository.ReviewRepository;

public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public List<ReviewDTO> getAllReviews() {
        List<ReviewDTO> reviewList = reviewRepository.getAllReviews();
        return reviewList;
    }
    
}
