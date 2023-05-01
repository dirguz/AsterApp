package com.example.asterapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AsterDB extends SQLiteOpenHelper {
    private static final String NOMBRE_BD="datos.db";
    private static final int VERSION_DB=1;
    private static final String TABLA_ASTER="CREATE TABLE ASTER(ID INTEGER PRIMARY KEY, NAME TEXT, MAGNITUD TEXT, HAZARDOUS TEXT, ORBIT TEXT, SENTRI TEXT)";

    public AsterDB(Context context) {
        super(context, NOMBRE_BD, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLA_ASTER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(new StringBuilder().append("DROP TABLE IF EXISTS ").append(TABLA_ASTER).toString());
        db.execSQL(TABLA_ASTER);
    }
}
