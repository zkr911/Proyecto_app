package com.nilson.proyectoaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnagregarhora;
    private  Button btnverhora;





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



    }









}