package com.nadia;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        InterestingFunctionality f = new InterestingFunctionality();
        System.out.println(f.makeSomething(5,8));
        System.out.println(new DateTime().dayOfWeek().get());
        logger.info("No, we haven't problems, we have friday.(c) Houston");
    }
}
