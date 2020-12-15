package com.genesyscharactersheetapp;

public class Characteristic {
    public int CharacteristicValue;
    public String CharacteristicName;

    public String getCharacteristicName() {
        return CharacteristicName;
    }

    public void setCharacteristicName(String characteristicName) {
        CharacteristicName = characteristicName;
    }

    public int getCharacteristicValue() {
        return CharacteristicValue;
    }

    public void setCharacteristicValue(int characteristicValue) {
        CharacteristicValue = characteristicValue;
    }

    public Characteristic(String name) {
        CharacteristicName = name;
    }



}
