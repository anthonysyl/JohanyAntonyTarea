package com.example.trabajitoconeljohan;

import static com.example.trabajitoconeljohan.R.id.et_codigo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segunda extends AppCompatActivity {
    private EditText etCorreo;
    private EditText etCodigo;
    private Button btnEnviar;
    private Button regresar_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        etCorreo = findViewById(R.id.et_correo);
        etCodigo = findViewById(R.id.et_codigo);
        btnEnviar = findViewById(R.id.btn_enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persona persona = crearPersona();
                Toast.makeText(Segunda.this, "Los datos han sido enviados", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Segunda.this, TercerActivity.class);
                intent.putExtra("persona", persona);
                startActivity(intent);
            }

        });

    }
    private Persona crearPersona() {
        String correo = etCorreo.getText().toString();
        String codigo = etCodigo.getText().toString();
        Persona persona = new Persona(correo, codigo);
        return persona;
    }

}