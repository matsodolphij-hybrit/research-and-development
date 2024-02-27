package com.research.designpatterns.factory;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public abstract class Car {

    private String name;

    private Long horsePower;

    public void displayCar() {
        log.atInfo().log("{} has {} horsepower", getName(), getHorsePower());
    }
}
