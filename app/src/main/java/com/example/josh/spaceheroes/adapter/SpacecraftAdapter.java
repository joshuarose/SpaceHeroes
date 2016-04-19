package com.example.josh.spaceheroes.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.widget.Space;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josh.spaceheroes.R;
import com.example.josh.spaceheroes.databinding.AstronautItemBinding;
import com.example.josh.spaceheroes.databinding.SpacecraftItemBinding;
import com.example.josh.spaceheroes.model.Astronaut;
import com.example.josh.spaceheroes.model.Spacecraft;

/**
 * Created by joshuarose on 4/19/16.
 */
public class SpacecraftAdapter extends RecyclerView.Adapter<SpacecraftAdapter.BindingHolder>{
    private Spacecraft[] crafts;

    public SpacecraftAdapter(Spacecraft[] crafts){
        this.crafts = crafts;
    }


    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_spacecraft, parent, false);
        return new BindingHolder(view);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        SpacecraftItemBinding binding = holder.binding;
        binding.setCraft(crafts[position]);
    }

    @Override
    public int getItemCount() {
        return crafts.length;
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private SpacecraftItemBinding binding;

        public BindingHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
