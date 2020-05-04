package com.klimavicius;

public interface Game {

    int getNumber();
    int getGuess();
    void setGuess();
    int getSmallest();
    int getBiggest();
    int getRemainGuesses();
    void reset();
    void check();
    boolean isValidNumber();
    boolean isGameWon();
    boolean isGameLost();

}
