package com.bastian.aburriyofirebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static String LOGTAG = "OpenCVActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (OpenCVLoader.initDebug()) {
            System.out.println("OpenCV loaded successfully");
        } else {
            System.out.println("OpenCV not loaded");
        }
    }

    public void irIniciar(View view) {
    Intent i = new Intent(this, IniciarSesionActivity.class);
    startActivity(i);
    }

    public void irRegistrar(View view) {
    Intent i = new Intent(this, RegistraActivity.class);
    startActivity(i);
    }

    public void irOpenCV(View view) {
    Intent i = new Intent(this, PaginaOpenCV.class);
    Toast.makeText(getApplicationContext(), "Abriendo OpenCV", Toast.LENGTH_SHORT).show();
    startActivity(i);
    }

}


