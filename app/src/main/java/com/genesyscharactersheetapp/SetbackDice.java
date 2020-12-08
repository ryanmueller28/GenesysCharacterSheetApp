package com.genesyscharactersheetapp;

/**
 * A class for the setback dice in the Genesys RPG system
 * The dice is 6 sided. We roll the super from the Dice base class
 * Then set the result equal to a face in the DiceFace Faces array
 */

public class SetbackDice extends Dice{

    public SetbackDice(String diceType) {
        super(diceType);
        this.setDiceType("Setback Dice", 6);
    }

    DiceFace resultFace;

    void SetResultFace(){
        int resultRoll = this.RollDice();

        switch (resultRoll){
            case 1:
                resultFace = DiceFace.faces[11]; // will be changed to blank
            case 2:
                resultFace = DiceFace.faces[11]; // will be changed to blank
            case 3:
                resultFace = DiceFace.faces[5];
            case 4:
                resultFace = DiceFace.faces[5];
            case 5:
                resultFace = DiceFace.faces[4];
            case 6:
                resultFace = DiceFace.faces[4];
        }
    }
}
