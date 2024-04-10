package com.designpatterns.facade;

public class RunFacade {

    public static void main(String[] args) {
        ComplexLibraryFacade facade = new ComplexLibraryFacade(); // all third party classes are hidden behind the facade.
        facade.performSomeComplexCalculation();
    }
}
