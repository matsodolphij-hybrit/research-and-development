package com.katas.cupcake.toppings;

import com.katas.cupcake.Food;
import com.katas.cupcake.ToppingDecorator;

public class SugarTopping extends ToppingDecorator {

    public SugarTopping(final Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return super.getName() + " with sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50; // adds 50 cent for sugar
    }
}
