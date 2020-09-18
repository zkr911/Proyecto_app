package com.nilson.proyectoaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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





    }









}