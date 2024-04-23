package com.katas.cupcake;

public class ToppingDecorator implements Food {

    private Food food;

    public ToppingDecorator(final Food food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName();
    }

    @Override
    public double getCost() {
        return food.getCost();
    }
}
