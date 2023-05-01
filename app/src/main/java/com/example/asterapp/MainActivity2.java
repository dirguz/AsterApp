package com.example.asterapp;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.example.asterapp.interfaz.PostService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.nasa.gov/neo/rest/v1/feed?start_date=2023-04-27&api_key=ExkSnfZ768qffgfgxmuA163HXiUZ4BM2LO3sYx2y")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostService apiService = retrofit.create(PostService.class);
        Call<List<Post>> call = PostService.getPosts();
        assert call != null;
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                List<Post> users = response.body();
                PostDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                        PostDatabase.class, "user-database").build();
                appDatabase.postDao().insertAll(users);
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Log.e(TAG, "Error fetching users", t);
            }
        });

        PostDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                PostDatabase.class, "user-database").build();
        List<Post> posts = appDatabase.postDao().getAll();
        PostAdapter adapter = new PostAdapter(posts);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}