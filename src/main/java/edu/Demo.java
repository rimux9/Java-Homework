package edu;




public class Demo {
    public static void main(String[] args) {
        Item phone = new Item("Phone", 500);
        Item book = new Item("Book", 18);
        Item shoes = new Item("Shoes", 8);
        Item tea = new Item("Tea", 4);
        Item coffe = new Item("Coffe", 5);

        ShoppingBag shoppingBag = new ShoppingBag();
        shoppingBag.addItem(phone);
        shoppingBag.addItem(book);
        shoppingBag.addItem(shoes);
        shoppingBag.addItem(tea);
        shoppingBag.addItem(coffe);
        System.out.println(shoppingBag);
        shoppingBag.getTotalPrice();
    }
}