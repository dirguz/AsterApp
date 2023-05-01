package com.example.asterapp.interfaz;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.asterapp.Post;

import java.util.List;

@Dao
public interface PostDao {
    @Query("SELECT * FROM ASTER")
    List<Post> getAll();

    @Insert
    void insertAll(List<Post> posts);
}
