package com.example.asterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_registro;
    Button bt_ingreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_registro=findViewById(R.id.registro);

        tv_registro.setOnClickListener(v -> {
            Intent intentReg = new Intent(MainActivity.this,Registro.class);
            MainActivity.this.startActivity(intentReg);
        });

        bt_ingreso=findViewById(R.id.ingreso);

        bt_ingreso.setOnClickListener(v -> {
            Intent intentReg = new Intent(MainActivity.this,MainActivity2.class);
            MainActivity.this.startActivity(intentReg);
        });
    }
}