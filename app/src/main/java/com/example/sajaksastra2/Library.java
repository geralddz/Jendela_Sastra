package com.example.sajaksastra2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageButton Back = findViewById(R.id.backlibrary);
        CardView Empatsekawan = findViewById(R.id.empatsekawan);

        Empatsekawan.setOnClickListener(v -> {
            Intent intent = new Intent(Library.this, empatsekawan.class);
            startActivity(intent);
        });

        Back.setOnClickListener(v -> {
            Intent intent = new Intent(Library.this, Home.class);
            startActivity(intent);
        });
    }
}