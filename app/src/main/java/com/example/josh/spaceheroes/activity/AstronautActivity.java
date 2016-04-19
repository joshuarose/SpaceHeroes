package com.example.josh.spaceheroes.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.josh.spaceheroes.R;
import com.example.josh.spaceheroes.adapter.AstronautAdapter;
import com.example.josh.spaceheroes.adapter.SpacecraftAdapter;
import com.example.josh.spaceheroes.databinding.AstronautListBinding;
import com.example.josh.spaceheroes.repository.AstronautRepository;
import com.example.josh.spaceheroes.repository.SpacecraftRepository;

/**
 * Created by joshuarose on 4/19/16.
 */
public class AstronautActivity extends AppCompatActivity {
    AstronautListBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_astronaut);
        setupRecycler();
    }

    private void setupRecycler() {
        binding.recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        AstronautRepository repository = new AstronautRepository();
        AstronautAdapter adapter = new AstronautAdapter(repository.getAstronauts());
        binding.recycler.setAdapter(adapter);
    }
}
