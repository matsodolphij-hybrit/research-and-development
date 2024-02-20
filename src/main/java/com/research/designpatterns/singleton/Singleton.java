package com.research.designpatterns.singleton;

/**
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance,
 * while providing a global access point to this instance.
 * This is an example of a lazy instantiation of the singleton object. Meaning that we won't initialize the singleton unless it is called for.
 *
 * Use cases:
 * Database connect class
 *
 * Information:
 * <a href="https://refactoring.guru/design-patterns/singleton">Singleton guru</a>
 */
public class Singleton {

    private final String message = "Somethong is Done.";
    private static Singleton singleton;

    private Singleton () { }

    /**
     * Synchronized is used to make it thread safe.
     * @return {@link Singleton}
     */
    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            System.out.println("Singleton has been instantiated.");
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getMessage()
    {
       return getInstance().message;
    }

}