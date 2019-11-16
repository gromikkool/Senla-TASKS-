package com.senla.task.sixth;

import java.util.ArrayList;
import java.util.List;

public class  Backpack {

    public static final double MAX_WEIGHT = 8;

    private double weight;
    private double price;
    private List<Item> items = new ArrayList<>();

    public Backpack(List<Item> items) {
        this.items = items;
    }

    public Backpack() {
    }

    public void addItem(Item item) {
        items.add(item);
    }

    private double calculateWeight() {
        double sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.getWeight();
        }

        return sumWeight;
    }

    private double calcPrice() {
        double sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.getPrice();
        }

        return sumPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getWeight() {
        weight = calculateWeight();
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        price = calcPrice();
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "weight=" + weight +
                ", price=" + price +
                ", items=" + items +
                '}';
    }
}
