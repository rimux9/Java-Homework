package edu;

import java.util.List;

public class ShoppingList {
    List<ShoppingBagOfShopp> shops;

    public ShoppingList(List<ShoppingBagOfShopp> shops) {
        this.shops = shops;

    }
    public double calculatePrice() {
        return shops.stream()
                .mapToDouble(shop -> shop.getShoppingBag().getTotalPrice())
                .sum();
    }
}
