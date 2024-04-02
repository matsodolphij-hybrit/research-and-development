package com.designpatterns.strategy;

public interface Flys {

    String fly();

}

class CanFly implements Flys {

    @Override
    public String fly() {
        return "Can fly";
    }
}


class CantFly implements Flys {

    @Override
    public String fly() {
        return "Can't fly";
    }
}

