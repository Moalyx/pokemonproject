package com.example.projetpokemon;

import android.media.Image;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        Pokemon canarticho = new Pokemon(screamArray[0], descriptionArray[0], R.drawable.canarticho,R.drawable.canarticho_pokedex);
        Pokemon dodrio = new Pokemon(screamArray[1], descriptionArray[1], R.drawable.dodrio,R.drawable.dodrio_pokedex);
        Pokemon flagadoss = new Pokemon(screamArray[2], descriptionArray[2], R.drawable.flagadoss,R.drawable.flagadoss_pokedex);
        Pokemon galopa = new Pokemon(screamArray[3],descriptionArray[3],R.drawable.galopa, R.drawable.galopa_pokedex);
        Pokemon lamantine = new Pokemon(screamArray[4], descriptionArray[4], R.drawable.lamantine,R.drawable.lamantine_pokedex);
        Pokemon magneton = new Pokemon(screamArray[5], descriptionArray[5], R.drawable.magneton, R.drawable.magneton_pokedex);

        pokemonList.add(canarticho);
        pokemonList.add(dodrio);
        pokemonList.add(flagadoss);
        pokemonList.add(galopa);
        pokemonList.add(lamantine);
        pokemonList.add(magneton);

        MyAdapter myAdapter = new MyAdapter(this,pokemonList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); /*qu'est ce qu'un layoutmanager*/





    }
}