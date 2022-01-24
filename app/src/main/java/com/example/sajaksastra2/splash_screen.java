package com.example.sajaksastra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        int load = 3000;

        new Handler().postDelayed(() -> {
            Intent SplashScreen = new Intent (splash_screen.this, MainActivity.class);
            startActivity(SplashScreen);
            finish();
        },load);
    }
}