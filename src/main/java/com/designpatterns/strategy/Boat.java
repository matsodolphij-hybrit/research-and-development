package com.designpatterns.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boat extends TransportationDevice {

    private boolean seaWorthy;

    public Boat() {
        setColour("White");
        setOccupants(3);
        setSeaWorthy(false);

        setFlyingType(new CantFly());
    }
}
