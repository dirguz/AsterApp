package com.example.asterapp.models;

public class Respuesta {
    private String id;
    private String name;
    private String absolute_magnitude_h;
    private String is_potentially_hazardous_asteroid;
    private String orbiting_body;
    private String is_sentry_object;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public void setAbsolute_magnitude_h(String absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    public String getIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(String is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public String getOrbiting_body() {
        return orbiting_body;
    }

    public void setOrbiting_body(String orbiting_body) {
        this.orbiting_body = orbiting_body;
    }

    public String getIs_sentry_object() {
        return is_sentry_object;
    }

    public void setIs_sentry_object(String is_sentry_object) {
        this.is_sentry_object = is_sentry_object;
    }
}
