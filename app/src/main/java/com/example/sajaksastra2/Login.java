package com.example.sajaksastra2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    ImageButton login2;
    EditText username, pass;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etusername);
        pass = findViewById(R.id.etpassword);
        preferences = getSharedPreferences("Userinfo", 0);
        login2 = findViewById(R.id.btlogin);

        login2.setOnClickListener(v -> {
            String uservalue = username.getText().toString();
            String pwvalue = pass.getText().toString();
            String registereduser = preferences.getString("Username", "");
            String registeredpass = preferences.getString("Password", "");

            if (uservalue.length()>1 && pwvalue.length()>1 && uservalue.equals(registereduser) && pwvalue.equals(registeredpass)) {
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
            } else {
                Toast.makeText(Login.this, "Username dan Password Salah!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}