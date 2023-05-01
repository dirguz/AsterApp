package com.example.asterapp;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "ASTER")
public class Post {
    @PrimaryKey
    @NonNull
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "absolute_magnitude_h")
    private String absolute_magnitude_h;

    @ColumnInfo(name = "is_potentially_hazardous_asteroid")
    private String is_potentially_hazardous_asteroid;

    @ColumnInfo(name = "orbiting_body")
    private String orbiting_body;

    @ColumnInfo(name = "is_sentry_object")
    private String is_sentry_object;

    public Post (int id,String name,String absolute_magnitude_h,String is_potentially_hazardous_asteroid,String orbiting_body, String is_sentry_object) {
        this.id = id;
        this.name = name;
        this.absolute_magnitude_h = absolute_magnitude_h;
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
        this.orbiting_body = orbiting_body;
        this.is_sentry_object = is_sentry_object;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }
    public String getIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }
    public String getOrbiting_body() {
        return orbiting_body;
    }
    public String getIs_sentry_object() {
        return is_sentry_object;
    }

}
