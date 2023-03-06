package com.example.trabajitoconeljohan;

import static com.example.trabajitoconeljohan.R.id.ingresarmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button segundactivity;
    Button Btn_ingresarmapa;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn_ingresarmapa = (Button) findViewById(R.id.ingresarmapa);
        Btn_ingresarmapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MapsFragment.class);
                startActivity(i);
            }
        });
        segundactivity=(Button) findViewById(R.id.segundaactivity);
        segundactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Segunda.class);
                startActivity(i);

            }
        });
    }
}