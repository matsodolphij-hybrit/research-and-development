package com.designpatterns.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googlePrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;

        this.observerID = ++observerIDTracker;

        log.atInfo().log("new stock observer has been created with observerID: {}.", observerID);

        stockGrabber.registerObserver(this);
    }



    @Override
    public void update(final double ibmPrice, final double aaplPrice, final double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googlePrice = googlePrice;

        log.atInfo().log("observerID {} just Updated prices: \n ibmPrice {} \n aaplPrice {} \n googlePrice {}.",observerID, ibmPrice, aaplPrice, googlePrice);
    }
}
