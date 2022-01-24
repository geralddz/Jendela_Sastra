package com.example.sajaksastra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Karyaku extends AppCompatActivity {
    ImageView imageView;
    Uri imageUri;
    final int REQUEST_CODE = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karyaku);

        ImageButton Back = findViewById(R.id.backkarya);
        ImageButton simpan = findViewById(R.id.simpan1);
        ImageButton uplod = findViewById(R.id.uplod1);
        imageView = findViewById(R.id.hslfoto);

        Back.setOnClickListener(v -> {
            Intent intent = new Intent(Karyaku.this, Ciptakan.class);
            startActivity(intent);
        });

        simpan.setOnClickListener(v -> {
            Toast.makeText(Karyaku.this, "Sorry... Under Maintenance", Toast.LENGTH_SHORT).show();
        });

        uplod.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        {
            imageUri = data.getData();
            imageView.setImageURI(imageUri);
        }
    }
}