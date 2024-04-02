package com.designpatterns.adapter;

/**
 * What is the adapter design pattern?
 * 1. it allows 2 incompatible interfaces to work together
 * 2. Used when the client expects a (target) interface
 * 3. The adapter class allows the use of the available interface and the target interface.
 * 4. Any class can work together as long as the adapter solves the issue that all classes must implement every method defined by the shared interface.
 */
public class HelicopterAdapter implements Vehicle {

    private Helicopter helicopter;

    public HelicopterAdapter(final Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    @Override
    public void openDoors() {
        this.helicopter.openHatch();
    }

    @Override
    public void driveForward() {
        this.helicopter.flyUp();
    }

    @Override
    public void assignDriver(final String driver) {
        this.helicopter.assignPilot(driver);

    }
}
