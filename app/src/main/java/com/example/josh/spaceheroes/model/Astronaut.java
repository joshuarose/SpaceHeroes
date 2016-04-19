package com.example.josh.spaceheroes.model;

/**
 * Created by joshuarose on 4/19/16.
 */
public class Astronaut {
    public final String image;
    public final String name;
    public final boolean deceased;

    public Astronaut(String name, String image, boolean deceased){
        this.name = name;
        this.image = image;
        this.deceased = deceased;
    }
}
