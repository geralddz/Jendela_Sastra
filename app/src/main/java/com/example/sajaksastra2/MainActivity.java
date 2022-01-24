package com.example.sajaksastra2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton Registrasi, Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Registrasi = findViewById(R.id.registrasi);
        Login = findViewById(R.id.login);

        Registrasi.setOnClickListener(v -> {
            Intent in = new Intent(MainActivity.this,Registrasi.class);
            startActivity(in);
        });

        Login.setOnClickListener(v -> {
            Intent in = new Intent(MainActivity.this,Login.class);
            startActivity(in);
        });
    }
}