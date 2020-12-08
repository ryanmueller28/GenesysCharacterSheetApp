package com.genesyscharactersheetapp;

/**
 * A class for the Challeng dice in the Genesys RPG system
 * The dice is 12 sided. We roll the super from the Dice base class
 * Then set the result equal to a face in the DiceFace Faces array
 */

public class ChallengeDice extends Dice {
    public ChallengeDice(String diceType) {
        super(diceType);
        this.setDiceType("Challenge Dice", 12);
    }

    DiceFace resultFace;

    void setResultFace(){

        int resultRoll = this.RollDice();

        switch (resultRoll){
            case 1:
                resultFace = DiceFace.faces[11]; // will be changed to blank
            case 2:
                resultFace = DiceFace.faces[5]; // will be changed to blank
            case 3:
                resultFace = DiceFace.faces[5];
            case 4:
                resultFace = DiceFace.faces[7];
            case 5:
                resultFace = DiceFace.faces[7];
            case 6:
                resultFace = DiceFace.faces[4];
            case 7:
                resultFace = DiceFace.faces[4];
            case 8:
                resultFace = DiceFace.faces[6];
            case 9:
                resultFace = DiceFace.faces[6];
            case 10:
                resultFace = DiceFace.faces[16];
            case 11:
                resultFace = DiceFace.faces[16];
            case 12:
                resultFace = DiceFace.faces[10];
        }
    }

}
