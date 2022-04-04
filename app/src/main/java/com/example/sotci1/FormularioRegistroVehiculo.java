package com.example.sotci1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormularioRegistroVehiculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro_vehiculo);
    }
    public void  registrar (View view) {
        Intent siguiente1 = new Intent(FormularioRegistroVehiculo.this, Login.class);
        startActivity(siguiente1);
        finish();
    }
}