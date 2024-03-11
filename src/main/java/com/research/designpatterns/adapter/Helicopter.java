package com.research.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Helicopter {

    public void flyUp() {
        log.atInfo().log("The helicopter flies upwards.");
    }

    public void openHatch() {
        log.atInfo().log("Opened the hatches of the helicopter.");
    }

    public void assignPilot(String pilot) {
        log.atInfo().log("{} is assigned as a pilot", pilot);
    }
}
