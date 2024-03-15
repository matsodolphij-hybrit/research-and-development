package com.research.designpatterns.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Sandwich {

    public final void makeSandwich() {
        cutBun();

        if (customerWantsMeat()) {
            addMeat();
        }

        if (customerWantsCheese()) {
            addCheese();
        }

        if (customerWantTomatoes()) {
            addTomatoes();
        }

        serveSandwich();
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addTomatoes();

    /**
     * Can be overridden if needed.
     *
     * @return true by default.
     */
    boolean customerWantsMeat() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }
    boolean customerWantTomatoes() {
        return false;
    }

    private void cutBun() {
        log.atInfo().log("Cutting the bun.");
    }

    private void serveSandwich() {
        log.atInfo().log("Serving the sandwich to the customer.");
    }
}
