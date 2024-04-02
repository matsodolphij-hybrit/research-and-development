package com.designpatterns.decorator;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Starting with thin dough";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
