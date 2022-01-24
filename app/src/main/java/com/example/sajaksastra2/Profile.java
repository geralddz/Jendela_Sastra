package com.example.sajaksastra2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Profile extends AppCompatActivity {

    ImageButton editprofil, kekaryaku;
    SharedPreferences preferences;
    TextView nama, email, hp, univ, bio;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar = findViewById(R.id.toolbar2);
        nama = findViewById(R.id.tvnama);
        email = findViewById(R.id.tvemail);
        hp = findViewById(R.id.tvHP);
        univ = findViewById(R.id.tvuniv);
        bio = findViewById(R.id.tvbio);
        editprofil = findViewById(R.id.bteditprofile);
        kekaryaku = findViewById(R.id.btkekaryaku);

        setSupportActionBar(toolbar);
        preferences = getSharedPreferences("User", 0);
        nama.setText(preferences.getString("Nama", ""));
        email.setText(preferences.getString("Email", ""));
        hp.setText(preferences.getString("No. HP", ""));
        univ.setText(preferences.getString("Univ", ""));
        bio.setText(preferences.getString("Bio", ""));

        editprofil.setOnClickListener(v -> {
            Intent in = new Intent(Profile.this,EditProfile.class);
            startActivity(in);
        });

        kekaryaku.setOnClickListener(v -> {
            Intent in = new Intent(Profile.this,Ciptakan.class);
            startActivity(in);
        });
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater i = getMenuInflater();
            i.inflate(R.menu.menu,menu);
            return true;
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item2) {
            Intent i = new Intent(Profile.this, MainActivity.class);
            startActivity(i);
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();
            editor.apply();
            Toast.makeText(this, "LOG-OUT Berhasil!!!", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}