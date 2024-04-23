package com.katas.cupcake;

public class Cupcake implements Food {

    final private static double COST = 1.0;

    @Override
    public String getName() {
        return "A plain cupcake";
    }

    @Override
    public double getCost() {
        return COST;
    }
}
