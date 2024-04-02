package com.designpatterns.factory;

/**
 *
 * What is a factory pattern?
 * When a method returns one of several possible classes that share a common super class.
 * The class is chosen at runtime.
 * ------------------------------
 * When to use a factory pattern?
 * 1: When you don't know ahead of time what class object you need
 * 2: When all the potential classes are in the same subclass hierarchy
 * 3: To centralize class selection code
 * 4: when you don't want the user to have to know every subclass
 * 5: to encapsulate object creation
 *
 */
public class VolkswagenFactory {

    public Car createCar(String type) {
        return switch (type) {
            case "polo" -> new Polo();
            case "golf" -> new Golf();
            default -> null;
        };
    }

}
