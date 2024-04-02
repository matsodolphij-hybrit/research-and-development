package com.designpatterns.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DivideNumbers implements Chain {

    private Chain nextInChain = null;

    @Override
    public void setNextChain(final Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(final Numbers request) {
        if (request.getCalculationWanted() == "divide") {
            log.atInfo().log(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));
        } else {
            log.atInfo().log("This chain can only add, subtract, multiply and divide.");
        }
    }
}