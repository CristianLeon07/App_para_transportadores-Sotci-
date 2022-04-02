package com.example.sotci1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, ImgInicial1.class);
                startActivity(intent);
                finish();

            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 2000);
    }
}