package com.example.sotci1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void  atras (View view) {
        Intent siguiente1 = new Intent(Login.this, Inicio.class);
        startActivity(siguiente1);
        finish();
    }
}