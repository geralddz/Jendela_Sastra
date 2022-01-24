package com.example.sajaksastra2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        ImageButton Back = findViewById(R.id.backtips);
        CardView Tentukan = findViewById(R.id.tentukan);
        CardView Latihan = findViewById(R.id.latihan);
        CardView Nikmati = findViewById(R.id.nikmati);
        CardView Bereksperimen = findViewById(R.id.bereksperimen);
        CardView TentukanWaktu = findViewById(R.id.tentukanwaktu);
        CardView BacaLebih = findViewById(R.id.bacalebih);
        CardView Temukan = findViewById(R.id.temukan);
        CardView Minta = findViewById(R.id.minta);
        CardView Catat = findViewById(R.id.catat);
        CardView CariMentor = findViewById(R.id.carimentor);
        CardView Kirimkemedia = findViewById(R.id.kirimkemedia);
        CardView JgnMnyrh = findViewById(R.id.jgnmenyerah);

        Back.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Home.class);
            startActivity(intent);
        });

        Tentukan.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, tentukan.class);
            startActivity(intent);
        });

        Latihan.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Latihan.class);
            startActivity(intent);
        });

        Nikmati.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Nikmati.class);
            startActivity(intent);
        });
        Bereksperimen.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Bereksperimen.class);
            startActivity(intent);
        });

        TentukanWaktu.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Tentukan_Waktu.class);
            startActivity(intent);
        });

        BacaLebih.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Baca_Lebih.class);
            startActivity(intent);
        });

        Temukan.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Temukan.class);
            startActivity(intent);
        });

        Minta.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Minta.class);
            startActivity(intent);
        });

        Catat.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Catat.class);
            startActivity(intent);
        });

        CariMentor.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Carilah_Mentor.class);
            startActivity(intent);
        });

        Kirimkemedia.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Kirim_Kemedia.class);
            startActivity(intent);
        });

        JgnMnyrh.setOnClickListener(v -> {
            Intent intent = new Intent(Tips.this, Jangan_Menyerah.class);
            startActivity(intent);
        });

    }
}