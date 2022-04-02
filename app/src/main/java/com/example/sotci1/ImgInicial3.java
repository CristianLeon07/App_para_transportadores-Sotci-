package com.example.sotci1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ImgInicial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_inicial3);

    }
        public void  siguiente3 (View view) {
            Intent siguiente1 = new Intent(ImgInicial3.this, ImgInicial4.class);
            startActivity(siguiente1);
            finish();
        }
        //Metodo para el boton siguiente
        public void  atras2 (View view) {
            Intent siguiente1 = new Intent(ImgInicial3.this, ImgInicial2.class);
            startActivity(siguiente1);
            finish();

        }
}