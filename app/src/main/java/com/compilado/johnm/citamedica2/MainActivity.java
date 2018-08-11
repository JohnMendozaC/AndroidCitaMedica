package com.compilado.johnm.citamedica2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.compilado.johnm.citamedica2.view.FirmaActivity;
import com.compilado.johnm.citamedica2.view.HistorialPacienteActivity;
import com.compilado.johnm.citamedica2.view.MedicoActivity;
import com.compilado.johnm.citamedica2.view.PacienteActivity;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button btnMedicos;
    private Button btnPacientes;
    private Button btnHPacientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnHPacientes = (Button) findViewById(R.id.btnHPacientes);
        this.btnPacientes = (Button) findViewById(R.id.btnPacientes);
        this.btnMedicos = (Button) findViewById(R.id.btnMedicos);

        btnMedicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MedicoActivity.class);
                startActivity(intent);
            }
        });

        btnPacientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PacienteActivity.class);
                startActivity(intent);
            }
        });

        btnHPacientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent historial = new Intent(v.getContext(),HistorialPacienteActivity.class);
//                historial.putExtra("idpaciente",0L);
//                historial.putExtra("idmedico",0l);
//                historial.putExtra("nombre","");
//                startActivity(historial);
                Intent historial = new Intent(v.getContext(),FirmaActivity.class);
                startActivity(historial);
            }
        });

    }
}
