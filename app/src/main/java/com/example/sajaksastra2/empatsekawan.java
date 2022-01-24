package com.example.sajaksastra2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class empatsekawan extends AppCompatActivity {

    ImageButton back, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empatsekawan);

        back = findViewById(R.id.bck);
        next = findViewById(R.id.nxt);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(empatsekawan.this, Library.class);
            startActivity(intent);
        });

        next.setOnClickListener(v -> {
            Intent intent = new Intent(empatsekawan.this, empatsekawan1.class);
            startActivity(intent);
        });

    }
}