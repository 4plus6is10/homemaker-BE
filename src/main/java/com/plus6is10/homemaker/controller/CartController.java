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

import com.plus6is10.homemaker.model.dto.CartDTO;
import com.plus6is10.homemaker.service.CartService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping()
    public void insertCart(@RequestBody CartDTO cartDTO) {
        cartService.insertCart(cartDTO);
    }

    @GetMapping()
    public List<CartDTO> getAllCart() {
        return cartService.getAllCart();
    }

    @DeleteMapping("/asin")
    public void deleteCart(@RequestParam String asin) {
        cartService.deleteCart(asin);
    }

}
