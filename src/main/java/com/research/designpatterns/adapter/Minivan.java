package com.research.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Minivan implements Vehicle {

    @Override
    public void openDoors() {
        log.atInfo().log("Doors opened.");
    }

    @Override
    public void driveForward() {
        log.atInfo().log("Driving forward");

    }

    @Override
    public void assignDriver(String driver) {
        log.atInfo().log("{} is driving the car", driver);
    }
}
