package com.bastian.aburriyofirebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irIniciar() {
    Intent i = new Intent(this, LoginActivity.class);
    startActivity(i);
    }

    public void irRegistrar() {
    Intent i = new Intent(this, LoginActivity.class);
    startActivity(i);
    }

}


