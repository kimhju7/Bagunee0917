package com.du.Bagunee0917.service;

import com.du.Bagunee0917.domain.CartItem;
import com.du.Bagunee0917.domain.Product;

import java.util.List;

public interface ShopService {
    List<Product> getProducts();
    List<CartItem> getCartItems();
    void addToCart(Long productId, int quantity);
    void removeFromCart(Long cartItemId);
}
