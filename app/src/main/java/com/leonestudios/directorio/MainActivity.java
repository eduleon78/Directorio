package com.leonestudios.directorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etPlannedDay;
    private EditText etTelefono;
    private EditText etEmail;
    private EditText etDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etPlannedDay = (EditText)findViewById(R.id.etPlannedDate);
        etTelefono = (EditText)findViewById(R.id.etTelefono);
        etEmail = (EditText)findViewById(R.id.etEmail);
       etDescripcion = (EditText)findViewById(R.id.etDescripcion);

        
    }

    public void Enviar (View view){

        Intent i = new Intent(this, MuestraDatos.class);
        i.putExtra("nombre", etNombre.getText().toString());
        i.putExtra("fecha", etPlannedDay.getText().toString());
        i.putExtra("telefono", etTelefono.getText().toString());
        i.putExtra("email", etEmail.getText().toString());
        i.putExtra("descripcion", etDescripcion.getText().toString());

        startActivity(i);
    }


}