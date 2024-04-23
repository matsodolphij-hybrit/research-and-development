package com.katas.cupcake;

import java.util.ArrayList;
import java.util.List;

public class FoodBundle implements Food {

    private String name;
    private List<Food> items;

    public FoodBundle(final String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(final Food item) {
        this.items.add(item);
    }

    public void removeItem(final Food item) {
        this.items.remove(item);
    }

    @Override
    public String getName() {
        StringBuilder bundleDescription = new StringBuilder();
        bundleDescription.append(this.name).append(":");
        for (final Food item : items) {
            bundleDescription.append(" ").append(item.getName());
        }
        return bundleDescription.toString() ;
    }

    @Override
    public double getCost() {
        double totalPrice = 0.0;
        for (final Food item : items) {
            totalPrice = totalPrice + item.getCost();
        }
        return totalPrice;
    }
}
