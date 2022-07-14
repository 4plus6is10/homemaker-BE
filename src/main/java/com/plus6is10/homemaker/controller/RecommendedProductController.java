package com.plus6is10.homemaker.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plus6is10.homemaker.model.dto.RecommendedProductDTO;
import com.plus6is10.homemaker.service.RecommendedProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("recoProducts")
public class RecommendedProductController {
    
    private final RecommendedProductService recoProductService;

    public RecommendedProductController(RecommendedProductService recoProductService) {
        this.recoProductService = recoProductService;
    }

    @GetMapping("/asin")
    public List<RecommendedProductDTO> getRecommendedProducts(@RequestParam String searchedAsin) {
        return recoProductService.getRecommendedProducts(searchedAsin);
    }
}
