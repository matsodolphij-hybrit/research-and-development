package com.designpatterns.observer;

/**
 * The Observer pattern is a software design pattern in which an object, called the subject, maintains a list of its
 * dependents, called observers, and notifies them automatically of any state changes, usually by calling of their
 * methods.
 *
 * When to use the Observer pattern?
 * 1. When you need many other objects ot receive an update when another object changes
 *  - Stock market with thousands of stocks need to send updates to objects representing individual stocks.
 *  - The subject (Publisher) sends many stocks to the Observers.
 *  - The observers (Subscribers) take the ones they want and use them
 *  2. Loose coupling benefit
 *  3. Negative: The Subject(Publisher) may send updates that don't matter to the Observer (Subscriber).
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
