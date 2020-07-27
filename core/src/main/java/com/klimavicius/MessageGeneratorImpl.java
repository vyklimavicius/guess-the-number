package com.klimavicius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    private static final Logger logger = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    @Autowired
    private Game game;

//    private int guessCount = 10;

    @PostConstruct
    public void notNull() {

        logger.debug("Game = {}", game.getGuessCount());

    }

    @Override
    public String returnAny() {
        return "calling method returnAny()";
    }
}
