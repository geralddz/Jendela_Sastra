package com.example.sajaksastra2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Challenge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        CardView chalnge = findViewById(R.id.puisi);
        ImageButton Back = findViewById(R.id.backclg);

        chalnge.setOnClickListener(v -> {
            Intent intent = new Intent(Challenge.this, Challenge1.class);
            startActivity(intent);
        });

        Back.setOnClickListener(v -> {
            Intent intent = new Intent(Challenge.this, Home.class);
            startActivity(intent);
        });

    }
}