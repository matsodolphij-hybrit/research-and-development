package com.designpatterns.chainOfResponsibility;

import lombok.Getter;

public class Numbers {

    @Getter
    private int number1;
    @Getter
    private int number2;
    @Getter
    private String calculationWanted;

    public Numbers(final int number1, final int number2, final String calculationWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationWanted = calculationWanted;
    }
}
