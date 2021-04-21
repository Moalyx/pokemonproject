package com.example.projetpokemon;

import android.content.Context;
import android.content.pm.ShortcutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    List<Pokemon> pokemonList;

    public MyAdapter(Context context, List<Pokemon> pokemonList) {
        this.context = context;
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent, false); /* qu'est ce qu'un layoutinflater*/
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.myText1.setText(pokemon.getScream());
        holder.myText2.setText(pokemon.getDescription());
        holder.imageViewTitle.setImageResource(pokemon.getTitle());
        holder.myImageView.setImageResource(pokemon.getImage());
    }

    @Override
    public int getItemCount()
    {
        return pokemonList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {    /*pourquoi on met une classe dans une autre classe?*/

        TextView myText1;
        TextView myText2;
        ImageView imageViewTitle;
        ImageView myImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText1 = itemView.findViewById(R.id.mytext1);
            myText2 = itemView.findViewById(R.id.mytext2);
            imageViewTitle = itemView.findViewById(R.id.imageViewTitle);
            myImageView = itemView.findViewById(R.id.myImageView);
        }
    }







}

