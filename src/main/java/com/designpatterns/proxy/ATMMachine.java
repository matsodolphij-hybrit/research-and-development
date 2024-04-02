package com.designpatterns.proxy;

class ATMMachine implements GetATMData {

    private ATMState atmState;
    private int cashInMachine;

    @Override
    public ATMState getATMData() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }

    // Not exposed via the common proxy interface and thus hidden
    public String getATMName() {
        return "The name of the atm machine";
    }

    // Not exposed via the common proxy interface and thus hidden
    public String getATMLocation() {
        return "The location of the atm machine";
    }
}
