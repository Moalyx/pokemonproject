package com.example.projetpokemon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerView extends AppCompatActivity {


    RecyclerView recyclerView;

    String s1[], s2[];

    int images[] = {R.drawable.canarticho_pokedex, R.drawable.dodrio_pokedex, R.drawable.flagadoss_pokedex, R.drawable.galopa_pokedex, R.drawable.lamantine_pokedex,
            R.drawable.magneton_pokedex};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.pokemon_name); /*pourquoi array.programming_Languages et pas : string-array.programming*/

        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }
}