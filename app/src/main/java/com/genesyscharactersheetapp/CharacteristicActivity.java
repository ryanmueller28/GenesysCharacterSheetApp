package com.genesyscharactersheetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CharacteristicActivity extends AppCompatActivity {

    public static final String EXTRA_CHARACTERISTIC_ID = "characteristicId";

    CharacterDatabaseHelper mDatabaseHelper;

    private Button btnAdd;
    private EditText charName, editBrawn, editAgility, editIntellect, editCunning, editWillpower, editPresence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characteristic);
        charName = (EditText) findViewById(R.id.editCharacterName);
        editBrawn = (EditText) findViewById(R.id.BrawnValue);
        editAgility = (EditText) findViewById(R.id.AgilityValue);
        editIntellect = (EditText) findViewById(R.id.IntellectValue);
        editCunning = (EditText) findViewById(R.id.CunningValue);
        editWillpower = (EditText) findViewById(R.id.WillpowerValue);
        editPresence = (EditText) findViewById(R.id.PresenceValue);
        btnAdd = (Button) findViewById(R.id.SubmitButton);
        mDatabaseHelper = new CharacterDatabaseHelper(this);

        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String insertName = charName.getText().toString();
                int insertBrawn = Integer.parseInt(editBrawn.getText().toString());
                int insertAgility = Integer.parseInt(editAgility.getText().toString());
                int insertIntellect = Integer.parseInt(editIntellect.getText().toString());
                int insertCunning = Integer.parseInt(editCunning.getText().toString());
                int insertWillpower = Integer.parseInt(editWillpower.getText().toString());
                int insertPresence = Integer.parseInt(editPresence.getText().toString());
                if (insertName.length() != 0 && insertBrawn != 0 &&
                        insertAgility != 0 && insertIntellect != 0 &&
                        insertCunning != 0 && insertWillpower != 0 &&
                        insertPresence != 0){
                    // add data
                    AddData(insertName, insertBrawn, insertAgility, insertIntellect, insertCunning, insertWillpower, insertPresence);
                    // reset values
                }else{
                    toastMessage("Failed to insert character into database. Missing a value");
                }
            }
        });

    }

    public void AddData(String characterName, int brawn, int agility, int intellect, int cunning, int willpower, int presence){
        mDatabaseHelper.insertCharacter(characterName, brawn, agility, intellect, cunning, willpower, presence);
    }

    private void toastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}