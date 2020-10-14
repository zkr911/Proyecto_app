package com.nilson.proyectoaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnagregarhora;
    private  Button btnverhora;


    public static ArrayList<informacionDatos> Arraydatos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    btnagregarhora = findViewById(R.id.btnagregarhora);
    btnverhora = findViewById(R.id.btnverhora);





    btnagregarhora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            Intent intento_agregar = new Intent(MainActivity.this,AgregarHoraActivity.class);
            startActivity(intento_agregar);

        }
    });



    btnverhora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intento_ver = new Intent(MainActivity.this,VerHorasActivity.class);
            startActivity(intento_ver);

        }
    });



    }









}