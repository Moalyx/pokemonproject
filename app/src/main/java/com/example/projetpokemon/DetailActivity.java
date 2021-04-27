package com.example.projetpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getIncomingIntent();


    }

    private void getIncomingIntent() {

        if (getIntent().hasExtra("image_detail")) {
            String imageDetail = getIntent().getStringExtra("image_detail");

            setImage(imageDetail);
        }
    }

    private void setImage(String imageDetail) {
        ImageView image = findViewById(R.id.image_detail);
        Glide.with(this)
                .load(imageDetail)
                //.circleCrop()
                //.centerCrop()
                .into(image);
    }


}