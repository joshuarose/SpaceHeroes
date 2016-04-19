package com.example.josh.spaceheroes.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by joshuarose on 4/19/16.
 */
public class Message extends BaseObservable {
    private String transmission;

    @Bindable
    public String getTransmission(){
        return transmission;
    }

    public void setTransmission(String value){
        transmission = value;
        notifyChange();
    }
}
