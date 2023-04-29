package com.example.asterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText edtNombre,edtApellidos,edtIdentifica,edtEmail,edtPass;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        edtNombre=findViewById(R.id.name);
        edtApellidos=findViewById(R.id.lastname);
        edtIdentifica=findViewById(R.id.ident);
        edtEmail=findViewById(R.id.email);
        edtPass=findViewById(R.id.passw);
        btnGuardar=findViewById(R.id.guardar);

        final DatosBD datosBD=new DatosBD(getApplicationContext());

        btnGuardar.setOnClickListener(v -> {
            datosBD.agregarUsuario(edtNombre.getText().toString(),edtApellidos.getText().toString(),edtIdentifica.getText().toString(),edtEmail.getText().toString(),edtPass.getText().toString());
            Toast.makeText(getApplicationContext(),"SE AGREGO CORRECTAMENTE",Toast.LENGTH_LONG).show();
        });
    }
}