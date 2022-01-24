package com.example.sajaksastra2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registrasi extends AppCompatActivity {
    ImageButton Regis1;
    EditText user, mail, etpw, etcpw;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        user = findViewById(R.id.etuser);
        mail = findViewById(R.id.etmail);
        Regis1 = findViewById(R.id.signin);
        etpw = findViewById(R.id.password);
        etcpw = findViewById(R.id.konfirm);

        preferences = getSharedPreferences("Userinfo", 0);
        //0 (mode privat)

        Regis1.setOnClickListener(v -> {
            String uservalue = user.getText().toString();
            String mailvalue = mail.getText().toString();
            String pwvalue = etpw.getText().toString();
            String cpwvalue = etcpw.getText().toString();

            if (uservalue.length()>1) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("Username", uservalue);
                editor.putString("Email", mailvalue);
                editor.putString("Password", pwvalue);
                editor.putString("Confirm Password", cpwvalue);
                editor.apply();
            }
            else {
                Toast.makeText(Registrasi.this, "Masukkan Username", Toast.LENGTH_SHORT).show();
            }

                if (mailvalue.length()==0){
                    Toast.makeText(Registrasi.this, "Masukkan Email", Toast.LENGTH_SHORT).show();
                }
                else if (etpw.getText().toString().length()==0 && (etcpw.getText().toString().length()==0)) {
                    etpw.setError("Password Tidak Boleh Kosong");
                } else if (etpw.getText().toString().length()!=0 && cpwvalue.equals(pwvalue)){
                    Toast.makeText(Registrasi.this, "Akun Terdaftar", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Registrasi.this, Login.class);
                    startActivity(intent);
                }else{
                    etcpw.setError("Konfirmasi Password Anda Salah");
                }

        });

    }
}