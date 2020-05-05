package com.klimavicius;

public interface Game {

    int getNumber();
    int getGuess();
    void setGuess(int guess);
    int getSmallest();
    int getBiggest();
    int getRemainGuesses();
    void reset();
    void check();
    boolean isValidNumberRange();
    boolean isGameWon();
    boolean isGameLost();

}
