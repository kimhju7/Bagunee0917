package com.du.Bagunee0917.domain;

import lombok.Data;

@Data
public class CartItem {
    private Long id;
    private Long productId;
    private int quantity;
    private Product product; //Join용
}
