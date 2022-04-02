package com.example.sotci1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void  login (View view) {
        Intent siguiente1 = new Intent(Inicio.this, Login.class);
        startActivity(siguiente1);
        finish();
    }
    public void  registrar (View view) {
        Intent siguiente1 = new Intent(Inicio.this, RegistroPrincipal.class);
        startActivity(siguiente1);
        finish();
    }
}