package com.plus6is10.homemaker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plus6is10.homemaker.model.dto.BasketDTO;
import com.plus6is10.homemaker.service.BasketService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/basket")
public class BasketController {
    
    @Autowired
    private BasketService basketService;

    @PostMapping()
    public void insertBasket(@RequestBody BasketDTO basketDTO) {
        basketService.insertBasket(basketDTO);
    }

    @GetMapping("/all")
    public List<BasketDTO> getAllBaskets() {
        return basketService.getAllBaskets();
    }

    @DeleteMapping("/delete")
    public void deleteBasket(@RequestParam String asin) {
        basketService.deleteBasket(asin);
    }

}
