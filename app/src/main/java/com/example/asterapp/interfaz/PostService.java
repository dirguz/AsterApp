package com.example.asterapp.interfaz;


import com.example.asterapp.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {
    @GET("posts")
    static Call<List<Post>> getPosts() {
        return null;
    }
}

