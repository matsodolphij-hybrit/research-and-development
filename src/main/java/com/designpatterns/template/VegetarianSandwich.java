package com.designpatterns.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VegetarianSandwich extends Sandwich {

    @Override
    void addMeat() {
        // vegetarian sandwich doesnt contain meat
    }

    @Override
    void addCheese() {
        log.atInfo().log("Adding provolone cheese and cheddar");
    }

    @Override
    void addTomatoes() {
        log.atInfo().log("Adding three tomato slices");
    }

    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantTomatoes() {
        return true;
    }
}
