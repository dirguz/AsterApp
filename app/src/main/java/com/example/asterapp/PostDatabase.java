package com.example.asterapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.asterapp.interfaz.PostDao;

@Database(entities = {Post.class}, version = 1)
public abstract class PostDatabase extends RoomDatabase {
    public abstract PostDao postDao();
}
