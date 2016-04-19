package com.example.josh.spaceheroes.model;

import android.support.annotation.DrawableRes;

/**
 * Created by joshuarose on 4/19/16.
 */
public class Launch {
    public final String launchName;
    @DrawableRes public final int launchGif;

    public Launch(String name, @DrawableRes int gif){
        launchName = name;
        launchGif = gif;
    }
}
