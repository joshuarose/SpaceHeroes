package com.example.josh.spaceheroes.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.josh.spaceheroes.R;
import com.example.josh.spaceheroes.adapter.SpacecraftAdapter;
import com.example.josh.spaceheroes.databinding.SpacecraftListBinding;
import com.example.josh.spaceheroes.repository.SpacecraftRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshuarose on 4/19/16.
 */
public class SpacecraftActivity extends AppCompatActivity {
    SpacecraftListBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_spacecraft);
        setupRecycler();
    }

    private void setupRecycler() {
        binding.recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        SpacecraftRepository repository = new SpacecraftRepository();
        SpacecraftAdapter adapter = new SpacecraftAdapter(repository.getSpacecrafts());
        binding.recycler.setAdapter(adapter);
    }
}
