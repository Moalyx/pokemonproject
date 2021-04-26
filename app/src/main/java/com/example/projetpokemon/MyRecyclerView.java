package com.example.projetpokemon;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyRecyclerView extends AppCompatActivity {


    RecyclerView recyclerView;

    List<Pokemon> pokemonList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);


        recyclerView = findViewById(R.id.recyclerView);
        String[] screamArray = getResources().getStringArray(R.array.pokemon_scream);
        String[] descriptionArray = getResources().getStringArray(R.array.description);
        String[] imageUrlArray = getResources().getStringArray(R.array.myUrls);
        String[] detailUrlArray = getResources().getStringArray(R.array.pokemonUrl);

        Pokemon canarticho = new Pokemon(screamArray[0], descriptionArray[0], R.drawable.canarticho, imageUrlArray[0], detailUrlArray[0]);
        Pokemon dodrio = new Pokemon(screamArray[1], descriptionArray[1], R.drawable.dodrio, imageUrlArray[1], detailUrlArray[1]);
        Pokemon flagadoss = new Pokemon(screamArray[2], descriptionArray[2], R.drawable.flagadoss, imageUrlArray[2], detailUrlArray[2]);
        Pokemon galopa = new Pokemon(screamArray[3], descriptionArray[3], R.drawable.galopa, imageUrlArray[3], detailUrlArray[3]);
        Pokemon lamantine = new Pokemon(screamArray[4], descriptionArray[4], R.drawable.lamantine, imageUrlArray[4], detailUrlArray[4]);
        Pokemon magneton = new Pokemon(screamArray[5], descriptionArray[5], R.drawable.magneton, imageUrlArray[5], detailUrlArray[5]);

        pokemonList.add(canarticho);
        pokemonList.add(dodrio);
        pokemonList.add(flagadoss);
        pokemonList.add(galopa);
        pokemonList.add(lamantine);
        pokemonList.add(magneton);

        MyAdapter myAdapter = new MyAdapter(this, pokemonList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}