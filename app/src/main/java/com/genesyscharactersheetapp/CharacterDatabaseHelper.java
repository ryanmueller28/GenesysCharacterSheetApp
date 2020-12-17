package com.genesyscharactersheetapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.provider.Contacts.SettingsColumns.KEY;

public class CharacterDatabaseHelper extends SQLiteOpenHelper {

    /**
     * Class Member Variables
     * Database name
     * Database version
     */
    private static final String DB_NAME = "characters";
    private static final int DB_VERSION = 1;

    CharacterDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateCharacterDatabase(db, 0, DB_VERSION);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateCharacterDatabase(db, oldVersion, newVersion);
    }

    public static void insertCharacter(String name,
                                        int brawn, int agility, int intellect,
                                        int cunning, int willpower, int presence){
        ContentValues characterValues = new ContentValues();
        characterValues.put("NAME", name);
        characterValues.put("BRAWN", brawn);
        characterValues.put("AGILITY", agility);
        characterValues.put("INTELLECT", intellect);
        characterValues.put("CUNNING", cunning);
        characterValues.put("WILLPOWER", willpower);
        characterValues.put("PRESENCE", presence);

        /**
         * To DO:
         * Store inventory, skills and talents
         */
    }


    private void updateCharacterDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if (oldVersion < 1){
            db.execSQL("CREATE TABLE CHARACTER ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "BRAWN INTEGER, "
                    + "AGILITY INTEGER,"
                    + "INTELLECT INTEGER,"
                    + "CUNNING INTEGER, "
                    + "WILLPOWER INTEGER,"
                    + "PRESENCE INTEGER); ");
        }
    }


}
