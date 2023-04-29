package com.example.asterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_registro=findViewById(R.id.registro);

        tv_registro.setOnClickListener(v -> {
            Intent intentReg = new Intent(MainActivity.this,Registro.class);
            MainActivity.this.startActivity(intentReg);
        });
    }
}