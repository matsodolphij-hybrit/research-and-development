package com.designpatterns.strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * Benefits of the Strategy pattern:
 *  1. No code duplication
 *  2. No changing of the inheritance structure
 *      Is sonarqube whining that the inheritance tree is too large? Encapsulate behaviour using this strategy pattern instead.
 *  3. Loose coupling
 *
 * When to use the strategy pattern?
 * 1. When you want to define a dclass that will have one behavior that is similar to other behaviors in a list ( like flying )
 * 1.1 You want the class object to be able to choose between flying, non-flying or perhaps a flying fast behaviors.
 */
@Getter
@Setter
public class TransportationDevice {

    private int occupants;
    private String colour;
    Flys flyingType; // encapsulation of behaviour which can be set dynamically.

    public String tryingToFly() {
        return flyingType.fly();
    }

}
