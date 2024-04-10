package com.designpatterns.facade.thirdPartyLibraries;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComplexClassOne {

    public void performDifficultCalculation() {
        log.atInfo().log("Perform difficult calculation");
    }

    public void performComplexCalculation() {
        log.atInfo().log("perform complex calculation");
    }
}
