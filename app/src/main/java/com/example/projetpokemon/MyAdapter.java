package com.example.projetpokemon;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
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
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.description.setText(pokemon.getDescription());
        holder.imageViewTitle.setImageResource(pokemon.getTitle(position));


        Glide.with(context)
                .load(pokemon.getImageUrl(position))
                .centerCrop()
                .into(holder.myImageView);

        //
        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokemonList.remove(pokemonList.get(position));
                notifyItemRemoved(position);
            }


        });

        holder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokemonList.add(pokemonList.get(position));
                notifyItemInserted(position);
            }
        });

//        holder.myImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Glide.with(context)
//                        .load(pokemon.getDetailUrl(position))
//                        .centerCrop()
//                        .into(holder.myImageView);
//
////                Intent intent = new Intent(context, ActivityDetailPokemon.class);
////                context.startActivity(intent);
//
//            }
//        });

        holder.myImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image_detail", pokemon.getDetailUrl(position));
                context.startActivity(intent);


            }
        });


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
        Button deleteButton;
        ConstraintLayout rowLayout;
        Button addButton;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            scream = itemView.findViewById(R.id.mytext1);
            description = itemView.findViewById(R.id.mytext2);
            imageViewTitle = itemView.findViewById(R.id.imageViewTitle);
            myImageView = itemView.findViewById(R.id.myImageView);
            deleteButton = itemView.findViewById(R.id.layout_list_delete);
            rowLayout = itemView.findViewById(R.id.rowLayout);
            addButton = itemView.findViewById(R.id.layout_list_add);

        }
    }
}

