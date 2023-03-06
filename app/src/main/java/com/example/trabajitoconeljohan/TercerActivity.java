package com.example.trabajitoconeljohan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        Segunda.Persona persona = getIntent().getParcelableExtra("persona");
        String nombre = persona.getNombre();
        int edad = persona.getEdad();

        TextView nombreTextView = findViewById(R.id.nombreTextView);
        TextView edadTextView = findViewById(R.id.edadTextView);

    }
}