package com.example.sajaksastra2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {

    ImageButton profil;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        TextView user = findViewById(R.id.tvuser);
        profil = findViewById(R.id.btnprofile);
        CardView ciptakaN = findViewById(R.id.ciptakan);
        CardView tips = findViewById(R.id.tips);
        CardView celens = findViewById(R.id.challenge);
        CardView library = findViewById(R.id.Library);


        preferences = getSharedPreferences("Userinfo", 0);

        user.setText(preferences.getString("Username", ""));

        profil.setOnClickListener(v -> {
          Intent intent = new Intent(Home.this, Profile.class);
          startActivity(intent);
        });

        ciptakaN.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Ciptakan.class);
            startActivity(intent);
        });

        tips.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Tips.class);
            startActivity(intent);
        });
        celens.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Challenge.class);
            startActivity(intent);
        });

        library.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Library.class);
            startActivity(intent);
        });
    }
}
