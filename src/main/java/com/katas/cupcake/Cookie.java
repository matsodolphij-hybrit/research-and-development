package com.katas.cupcake;

public class Cookie implements Food {

    @Override
    public String getName() {
        return "A cookie";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
