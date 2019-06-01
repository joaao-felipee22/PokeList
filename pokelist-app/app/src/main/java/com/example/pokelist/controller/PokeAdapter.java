package com.example.pokelist.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.pokelist.R;
import com.example.pokelist.model.pokeList.PokePojo;

import java.util.ArrayList;

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.ViewPokeHolder> {

    ArrayList<PokePojo> listaCards;

    Context context;


    public PokeAdapter(ArrayList<PokePojo> listaCards, Context context) {
        this.listaCards = listaCards;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewPokeHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view, parent, false);
        return new PokeAdapter.ViewPokeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPokeHolder holder, int position) {
        PokePojo p = listaCards.get(position);
        holder.name.setText(p.getName());
        Glide.with(context)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + p.setNumber() + ".png")
                .centerCrop()
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.url);
    }

    @Override
    public int getItemCount() {
        return listaCards.size();
    }

    public class ViewPokeHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView url;
        CardView cardView;

        public ViewPokeHolder(@NonNull View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.card_view);
            name = (TextView) itemView.findViewById(R.id.namepoke);
            url = (ImageView) itemView.findViewById(R.id.img_poke);
        }
    }
}
