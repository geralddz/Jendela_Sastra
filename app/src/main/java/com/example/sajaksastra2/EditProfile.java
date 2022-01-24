package com.example.sajaksastra2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfile extends AppCompatActivity {

    ImageButton simpan;
    EditText etuniv, etbio, etNama, etHP, etEmail;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etNama = findViewById(R.id.etnama);
        etuniv = findViewById(R.id.etuniv);
        etEmail = findViewById(R.id.etemail);
        etHP = findViewById(R.id.ethp);
        etbio = findViewById(R.id.etbio);
        simpan = findViewById(R.id.btnsave);
        preferences = getSharedPreferences("User", 0);

        simpan.setOnClickListener(v -> {
            String inputnama = etNama.getText().toString();
            String inputuniv= etuniv.getText().toString();
            String inputemail = etEmail.getText().toString();
            String inputhp = etHP.getText().toString();
            String inputbio = etbio.getText().toString();

            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("Email", inputemail);
            editor.putString("Nama", inputnama);
            editor.putString("No. HP", inputhp);
            editor.putString("Univ", inputuniv);
            editor.putString("Bio", inputbio);
            editor.apply();
            Toast.makeText(EditProfile.this, "Edit Profile Tersimpan", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(EditProfile.this, Profile.class);
            startActivity(intent);
        });

    }
}