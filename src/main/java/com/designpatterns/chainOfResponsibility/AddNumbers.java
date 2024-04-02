package com.designpatterns.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(final Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(final Numbers request) {
        if (request.getCalculationWanted() == "add") {
            log.atInfo().log(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }

    }
}
