package com.bastian.aburriyofirebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class BienvenidaLogoutCV2 extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida_logout_cv2);

        mAuth = FirebaseAuth.getInstance();
    }

    public void cerrarSesion(View view){
        Intent i = new Intent(this, MainActivity.class);
        FirebaseAuth.getInstance().signOut();
        Toast.makeText(getApplicationContext(), "Sesión cerrada", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }

    public void irOpenCV(View view) {
        Intent i = new Intent(this, PaginaOpenCV.class);
        Toast.makeText(getApplicationContext(), "OpenCV", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }


}