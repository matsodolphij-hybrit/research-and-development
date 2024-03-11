package com.research.designpatterns.adapter;

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
