package com.example.asterapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatosBD extends SQLiteOpenHelper {

    private static final String NOMBRE_BD="datos.db";
    private static final int VERSION_DB=1;
    private static final String TABLA_USERS="CREATE TABLE USERS(NOMBRES TEXT, APELLIDOS TEXT, IDENTIFICA INT, EMAIL TEXT, PASS TEXT)";

    public DatosBD(Context context) {
        super(context, NOMBRE_BD, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLA_USERS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(new StringBuilder().append("DROP TABLE IF EXISTS ").append(TABLA_USERS).toString());
        db.execSQL(TABLA_USERS);
    }

    public void agregarUsuario(String nombres, String apellidos, String identifica, String email, String pass ){
        SQLiteDatabase bd=getWritableDatabase();
        if (bd!=null){
            bd.execSQL("INSERT INTO USERS VALUES('"+nombres+"','"+apellidos+"','"+identifica+"','"+email+"','"+pass+"')");
            bd.close();
        }
    }
}
