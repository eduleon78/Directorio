package com.leonestudios.directorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MuestraDatos extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_datos);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);

        String nombre = getIntent().getStringExtra("nombre");
        tv1.setText("Nombre: " + nombre);
        String fecha = getIntent().getStringExtra("fecha");
        tv2.setText("fecha: " + fecha);
        String telefono = getIntent().getStringExtra("telefono");
        tv3.setText("Telefono: " + telefono);
        String email = getIntent().getStringExtra("email");
        tv4.setText("Email: " + email);
        String descripcion = getIntent().getStringExtra("descripcion");
        tv5.setText("Descripcion: " + descripcion);

    }

    public void Editar (View view){
        Intent Editar = new Intent(this, MainActivity.class);
        startActivity(Editar);
    }
}