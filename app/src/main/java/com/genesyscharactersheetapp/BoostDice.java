package com.genesyscharactersheetapp;

/**
 * A class for the boost dice in the Genesys RPG system
 * The dice is 6 sided. We roll the super from the Dice base class
 * Then set the result equal to a face in the DiceFace Faces array
 */
public class BoostDice extends Dice {
    public BoostDice(String diceType) {
        super(diceType);
        this.setDiceType("Boost Dice", 6);
    }

    DiceFace resultFace;

    void setResultFace(){
        int resultRoll = this.RollDice();

        switch (resultRoll){
            case 1:
                resultFace = DiceFace.faces[11]; // will be changed to blank
            case 2:
                resultFace = DiceFace.faces[11]; // will be changed to blank
            case 3:
                resultFace = DiceFace.faces[8];
            case 4:
                resultFace = DiceFace.faces[2];
            case 5:
                resultFace = DiceFace.faces[0];
            case 6:
                resultFace = DiceFace.faces[3];
        }
    }
}
