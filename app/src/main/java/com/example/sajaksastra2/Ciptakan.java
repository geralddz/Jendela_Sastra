package com.example.sajaksastra2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Ciptakan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciptakan);
        CardView karya1 = findViewById(R.id.karyaku1);
        ImageButton Back = findViewById(R.id.backkaryaku);
        ImageButton tambah = findViewById(R.id.tambahkarya);

        tambah.setOnClickListener(v -> {
            Intent intent = new Intent(Ciptakan.this, Karyaku.class);
            startActivity(intent);
        });

        karya1.setOnClickListener(v -> {
            Intent intent = new Intent(Ciptakan.this, empatsekawan.class);
            startActivity(intent);
        });
        Back.setOnClickListener(v -> {
            Intent intent = new Intent(Ciptakan.this, Home.class);
            startActivity(intent);
        });

    }
}