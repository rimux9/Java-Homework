package edu;

public class ShoppingBagOfShopp {
    private String ShopName;
    private ShoppingBag shoppingBag;

    public ShoppingBagOfShopp(String shopName, ShoppingBag shoppingBag) {
        ShopName = shopName;
        this.shoppingBag = shoppingBag;
    }

    public String getShopName() {
        return ShopName;
    }

    public ShoppingBag getShoppingBag() {
        return shoppingBag;
    }
}
