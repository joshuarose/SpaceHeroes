package com.example.josh.spaceheroes.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.josh.spaceheroes.R;
import com.example.josh.spaceheroes.databinding.MainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    MainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindEvents();
    }

    private void bindEvents() {
        binding.fab.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LaunchActivity.class));
        });

        binding.buttonMessage.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MessageActivity.class));
        });

        binding.buttonAstronaut.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AstronautActivity.class));
        });

        binding.buttonSpacecraft.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SpacecraftActivity.class));
        });
    }
}
