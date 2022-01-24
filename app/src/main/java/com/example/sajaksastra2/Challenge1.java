package com.example.sajaksastra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Challenge1 extends AppCompatActivity {

    ImageButton karya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1);

        karya = findViewById(R.id.buatkarya);

        karya.setOnClickListener(v -> {
            Intent intent = new Intent(Challenge1.this, Ciptakan.class);
            startActivity(intent);
        });

    }
}