package com.genesyscharactersheetapp;

import java.util.Random;

public class Dice {
    private String DiceType;
    private int NumSides;

    public int getNumSides() {
        return NumSides;
    }

    public void setNumSides(int numSides) {
        NumSides = numSides;
    }

    public String getDiceType() {
        return DiceType;
    }

    public void setDiceType(String diceType, int numSides) {
        DiceType = diceType;
        NumSides = numSides;
    }

    public Dice(String diceType) {
        DiceType = diceType;
    }

    public int RollDice() {
        Random prng = new Random();
        return prng.nextInt(NumSides + 1);
    }

}
