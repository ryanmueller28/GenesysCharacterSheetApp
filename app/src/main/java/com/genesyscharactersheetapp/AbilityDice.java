package com.genesyscharactersheetapp;

/**
 * A class for the ability dice in the Genesys RPG system
 * The dice is 8 sided. We roll the super from the Dice base class
 * Then set the result equal to a face in the DiceFace Faces array
 */

public class AbilityDice extends Dice {
    public AbilityDice(String diceType) {
        super(diceType);
        this.setDiceType("Ability Dice", 8);
    }

    DiceFace resultFace;

    void setResultFace(){
        int resultRoll = this.RollDice();

        switch (resultRoll){
            case 1:
                resultFace = DiceFace.faces[11];
            case 2:
                resultFace = DiceFace.faces[8];
            case 3:
                resultFace = DiceFace.faces[8];
            case 4:
                resultFace = DiceFace.faces[1];
            case 5:
                resultFace = DiceFace.faces[3];
            case 6:
                resultFace = DiceFace.faces[3];
            case 7:
                resultFace = DiceFace.faces[2];
            case 8:
                resultFace = DiceFace.faces[0];
        }
    }

}
