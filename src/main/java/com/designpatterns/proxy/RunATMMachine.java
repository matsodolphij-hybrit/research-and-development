package com.designpatterns.proxy;

/**
 * What is the proxy design pattern?
 * - Provide a class which will limit access to another class
 * why would you need this pattern?
 *  1. For security reasons
 *  2. Because an object is intensive to create
 *  3. Is accessed from a remote location
 */
public class RunATMMachine {

    public static void main(String[] args) {

        // The proxy hides all methods that we do not want to expose.
        GetATMData atmDataProxy = new ATMProxy();

        // The real machine has all available methods, including those we do not want to expose.
        ATMMachine atmData = new ATMMachine();

        // All methods that we want to expose will be defined in the GetATMData interface.
    }
}
