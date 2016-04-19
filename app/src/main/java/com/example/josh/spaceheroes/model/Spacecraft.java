package com.example.josh.spaceheroes.model;

import android.support.v4.widget.Space;

/**
 * Created by joshuarose on 4/19/16.
 */
public class Spacecraft {
    public final String image;
    public final String name;
    public final boolean isShuttle;

    public Spacecraft(String name, String image, boolean isShuttle){
        this.name = name;
        this.image = image;
        this.isShuttle = isShuttle;
    }
}
