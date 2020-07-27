package com.klimavicius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    private static final Logger log = LoggerFactory.getLogger(GameImpl.class);
    private final Random random = new Random();


    @Autowired
    @MaxNumber
    private int maxNumber;

    @Override
    public int next() {
        log.info(Integer.toString(maxNumber));
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return this.maxNumber;
    }

}
