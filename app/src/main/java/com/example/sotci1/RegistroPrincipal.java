package com.example.sotci1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_principal);
    }
    public void  rUsuario (View view) {
        Intent siguiente1 = new Intent(RegistroPrincipal.this, RegistroUsuario.class);
        startActivity(siguiente1);
        finish();
    }
    public void  rTrasnportador (View view) {
        Intent siguiente1 = new Intent(RegistroPrincipal.this, RegistroTransportador.class);
        startActivity(siguiente1);
        finish();
    }
}