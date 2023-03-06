package com.example.trabajitoconeljohan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {
    private TextView tvCorreo;
    private TextView tvCodigo;
    private TextView tvNota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        tvCorreo = findViewById(R.id.tv_correo);
        tvCodigo = findViewById(R.id.tv_codigo);
        tvNota = findViewById(R.id.tv_nota);

        Persona persona = getIntent().getParcelableExtra("persona");

        tvCorreo.setText(persona.getCorreo());
        tvCodigo.setText(persona.getCodigo());
        tvNota.setText("Nota: 4.5");
    }
}