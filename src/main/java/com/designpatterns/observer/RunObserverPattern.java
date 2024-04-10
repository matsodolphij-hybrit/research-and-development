package com.designpatterns.observer;

public class RunObserverPattern {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer = new StockObserver(stockGrabber);

        StockObserver observerTwo = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(1.00);
        stockGrabber.setAaplPrice(11.00);
        stockGrabber.setGooglePrice(85.00);


    }
}
