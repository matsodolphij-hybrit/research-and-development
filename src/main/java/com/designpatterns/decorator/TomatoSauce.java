package com.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(final Pizza pizza) {
        super(pizza);

      log.atInfo().log("Adding tomato sauce");
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " adding tomato sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .35;
    }
}
