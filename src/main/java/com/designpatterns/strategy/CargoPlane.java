package com.designpatterns.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CargoPlane extends TransportationDevice {

    private int numberOfEngines;

    public CargoPlane() {
        setColour("red");
        setOccupants(25);
        setNumberOfEngines(4);

        setFlyingType(new CanFly());
    }

}
