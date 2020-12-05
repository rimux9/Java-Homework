package edu;

import java.util.ArrayList;
public class ShoppingBag {
    private final ArrayList<Item> items;
    public ShoppingBag() {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public double getTotalPrice() {
        double sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Item item : this.items) {
            stringBuilder.append("Item: ").append(item.getName()).append("\n");
            stringBuilder.append("Price: ").append(item.getPrice()).append("\n");
            stringBuilder.append("************************************" + "\n");
        }
        return stringBuilder.toString();
    }
    public int getItems() {
        return items.size();
    }
}