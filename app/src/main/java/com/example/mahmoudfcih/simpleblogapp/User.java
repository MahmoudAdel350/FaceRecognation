package com.example.mahmoudfcih.simpleblogapp;

/**
 * Created by mahmoud on 3/22/2017.
 */

public class User {
    String image;
    String name;

    public User(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public User() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
