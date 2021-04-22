package com.example.projetpokemon;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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
        View view = inflater.inflate(R.layout.my_row, parent, false); /* qu'est ce qu'un layoutinflater*/
        return new MyViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.scream.setText(pokemon.getScream());
        holder.description.setText(pokemon.getDescription());
        holder.imageViewTitle.setImageResource(pokemon.getTitle(position));

        Glide.with(context)
                .load(pokemon.getImageUrl(position))
                .centerCrop()
                .into(holder.myImageView);

    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView scream;
        TextView description;
        ImageView imageViewTitle;
        ImageView myImageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            scream = itemView.findViewById(R.id.mytext1);
            description = itemView.findViewById(R.id.mytext2);
            imageViewTitle = itemView.findViewById(R.id.imageViewTitle);
            myImageView = itemView.findViewById(R.id.myImageView);
        }
    }


}

