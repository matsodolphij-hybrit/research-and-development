package com.designpatterns.proxy;

public class ATMProxy implements GetATMData {

    @Override
    public ATMState getATMData() {
        ATMMachine machine = new ATMMachine();
        return machine.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine machine = new ATMMachine();
        return machine.getCashInMachine();
    }
}
