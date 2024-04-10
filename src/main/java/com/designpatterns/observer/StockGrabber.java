package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockGrabber implements Subject {

    private List<Observer> observers;

    // current prices
    private double ibmPrice;
    private double aaplPrice;
    private double googlePrice;

    public StockGrabber() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(final Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(final Observer o) {
        this.observers.remove(o);
        log.atInfo().log("Removed observer {}", o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(ibmPrice, aaplPrice, googlePrice);
        }
    }

    public void setIbmPrice(final double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setAaplPrice(final double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }

    public void setGooglePrice(final double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObservers();
    }
}
