package com.example.trabajitoconeljohan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segunda extends AppCompatActivity {
    EditText nombreEditText;
    EditText edadEditText;
    Button guardarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        EditText nombreEditText = findViewById(R.id.nombreEditText);
        EditText edadEditText = findViewById(R.id.codigoEditText);
        Button guardarButton = findViewById(R.id.guardarButton);
        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombreEditText.getText().toString();
                int codigo = Integer.parseInt(edadEditText.getText().toString());

                Persona persona = new Persona(nombre, codigo);
                Intent i  = new Intent(Segunda.this, TercerActivity.class);
                i.putExtra("persona", (CharSequence) persona);
                startActivity(i);
            }
        });

    }
    public class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }
}