package com.genesyscharactersheetapp;

public class DifficultyDice extends Dice {

    public DifficultyDice(String diceType) {
        super(diceType);
        this.setDiceType("Difficulty Dice", 8);
    }

    DiceFace resultFace;

    void setResultFace(){
        int resultRoll = this.RollDice();

        switch (resultRoll){
            case 1:
                //set result face to blank
                resultFace = DiceFace.faces[11]; //will be changed to index 11
            case 2:
                //success
                resultFace = DiceFace.faces[5];
            case 3:
                resultFace = DiceFace.faces[7];
            case 4:
                //advantage
                resultFace = DiceFace.faces[4];
            case 5:
                resultFace = DiceFace.faces[4];
            case 6:
                resultFace = DiceFace.faces[4];
            case 7:
                resultFace = DiceFace.faces[16];
            case 8:
                resultFace = DiceFace.faces[6];
        }
    }

}
