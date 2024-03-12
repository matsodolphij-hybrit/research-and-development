package com.research.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mozzarella extends ToppingDecorator {
    public Mozzarella(final Pizza pizza) {
        super(pizza);

        log.atInfo().log("Adding mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " adding mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
