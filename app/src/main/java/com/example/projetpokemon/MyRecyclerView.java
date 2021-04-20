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

    List <String> s1;

    List <String> s2;

    List <Integer> title = new ArrayList<>();

    List <Integer> images = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);

        title.add(R.drawable.canarticho);
        title.add(R.drawable.dodrio);
        title.add(R.drawable.flagadoss);
        title.add(R.drawable.galopa);
        title.add(R.drawable.lamantine);
        title.add(R.drawable.magneton);

        images.add(R.drawable.canarticho_pokedex);
        images.add(R.drawable.dodrio_pokedex);
        images.add(R.drawable.flagadoss_pokedex);
        images.add(R.drawable.galopa_pokedex);
        images.add(R.drawable.lamantine_pokedex);
        images.add(R.drawable.magneton_pokedex);

        s1 = Arrays.asList(getResources().getStringArray(R.array.pokemon_scream));
        s2 = Arrays.asList(getResources().getStringArray(R.array.description));

        MyAdapter myAdapter = new MyAdapter(this,s1,s2, title, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); /*qu'est ce qu'un layoutmanager*/





    }
}