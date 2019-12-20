package com.nadia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterestingFunctionality {
    private static final int SPECIAL = 732;
    public double makeSomething(int x, int y) {
        Logger logger = LoggerFactory.getLogger(InterestingFunctionality.class);
        logger.warn("Houston, we have problems!");
        return (double) SPECIAL /(1+x*x) + (double)1/(SPECIAL +y*y);
    }
}
