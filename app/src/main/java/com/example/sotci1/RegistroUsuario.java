package com.example.sotci1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
    }
    public void  cancelar (View view) {
        Intent siguiente1 = new Intent(RegistroUsuario.this, Inicio.class);
        startActivity(siguiente1);
        finish();
    }
}