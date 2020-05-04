package com.klimavicius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameImpl implements Game {

    private static final Logger log = LoggerFactory.getLogger(GameImpl.class);
    private NumberGeneratorImpl numberGenerator;
    private int guessCount = 10;
    private int number;
    private int guess;
    private int smallest;
    private int largest;

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getGuess() {
        return 0;
    }

    @Override
    public void setGuess() {

    }

    @Override
    public int getSmallest() {
        return 0;
    }

    @Override
    public int getBiggest() {
        return 0;
    }

    @Override
    public int getRemainGuesses() {
        return 0;
    }

    @Override
    public void reset() {

    }

    @Override
    public void check() {

    }

    @Override
    public boolean isValidNumber() {
        return false;
    }

    @Override
    public boolean isGameWon() {
        return false;
    }

    @Override
    public boolean isGameLost() {
        return false;
    }
}
