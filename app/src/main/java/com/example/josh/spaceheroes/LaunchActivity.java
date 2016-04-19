package com.example.josh.spaceheroes;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.josh.spaceheroes.databinding.LaunchBinding;

/**
 * Created by Josh on 4/17/2016.
 */
public class LaunchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LaunchBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_launch);
    }
}
