package com.example.projetpokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEmailInput;
    private EditText mPassWordInput;
    private Button mGoPlayButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);
        final MediaPlayer pika = MediaPlayer.create(this, R.raw.pikapika);
        mEmailInput = findViewById(R.id.activity_main_enter_mail);
        mPassWordInput = findViewById(R.id.activity_main_enter_password);
        mGoPlayButton = findViewById(R.id.activity_main_go_button);

        Toast toast = new Toast(this);
        ImageView view = new ImageView(this);
        view.setImageResource(R.drawable.thunder);

        Toast toast2 = new Toast(this);
        ImageView view2 = new ImageView(this);
        view2.setImageResource(R.drawable.error_15261);


        mGoPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEmailInput.getText().toString().equals("admin@admin.com") &&
                        mPassWordInput.getText().toString().equals("admin")) {
                    pika.start();
                    mGoPlayButton.setEnabled(true);
                    Intent myRecyclerView = new Intent(MainActivity.this, MyRecyclerView.class);
                    startActivity(myRecyclerView);
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    toast.setView(view);
                    toast.show();
                } else {
                    mp.start();
                    Toast.makeText(MainActivity.this, "INCORRECT", Toast.LENGTH_SHORT).show();
                    toast.setView(view2);
                    toast.show();

                }

            }
        });


    }
}