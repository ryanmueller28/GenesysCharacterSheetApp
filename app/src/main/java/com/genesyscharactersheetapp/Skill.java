package com.genesyscharactersheetapp;

public class Skill {
    public String SkillName;
    public int SkillValue;
    private String characteristicAssociatedName;

    Characteristic AssociatedCharacteristic = new Characteristic(characteristicAssociatedName);

    int AbilityDiceCount = AssociatedCharacteristic.getCharacteristicValue();

    int ProficiencyDiceCount = SkillValue;

    AbilityDice[] AbilityDicePool = new AbilityDice[AbilityDiceCount];
    ProficiencyDice[] ProficiencyDicePool = new ProficiencyDice[ProficiencyDiceCount];

    public Skill(String skillName, int skillValue, String characteristicAssociatedName) {
        SkillName = skillName;
        SkillValue = skillValue;
        this.characteristicAssociatedName = characteristicAssociatedName;
    }

    public void RollSkillCheck(){
        for (int i = 0; i < AbilityDiceCount; i++){
            AbilityDicePool[i].RollDice();
        }

        for (int i = 0; i < ProficiencyDiceCount; i++){
            ProficiencyDicePool[i].RollDice();
        }

    }
}
