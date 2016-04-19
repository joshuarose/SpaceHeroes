package com.example.josh.spaceheroes.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josh.spaceheroes.R;
import com.example.josh.spaceheroes.databinding.AstronautItemBinding;
import com.example.josh.spaceheroes.model.Astronaut;

/**
 * Created by joshuarose on 4/19/16.
 */
public class AstronautAdapter extends RecyclerView.Adapter<AstronautAdapter.BindingHolder> {
    private Astronaut[] astronauts;

    public AstronautAdapter(Astronaut[] astronauts){
        this.astronauts = astronauts;
    }


    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_astronaut, parent, false);
        return new BindingHolder(view);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        AstronautItemBinding binding = holder.binding;
        binding.setAstronaut(astronauts[position]);
    }

    @Override
    public int getItemCount() {
        return astronauts.length;
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private AstronautItemBinding binding;

        public BindingHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
