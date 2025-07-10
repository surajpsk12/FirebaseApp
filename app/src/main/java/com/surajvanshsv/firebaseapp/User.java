package com.surajvanshsv.firebaseapp;

public class User {

    String name;
    String emial;

    public User(String name, String emial) {
        this.name = name;
        this.emial = emial;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }
}
