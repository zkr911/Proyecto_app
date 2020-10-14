package com.nilson.proyectoaplicacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class VerHorasActivity extends AppCompatActivity {

    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_horas);

        recyclerView = findViewById(R.id.recyclerVerHoras);
        recyclerView.setLayoutManager(new LinearLayoutManager(VerHorasActivity.this));
        Adaptadores adaptadores = new Adaptadores(MainActivity.Arraydatos);
        recyclerView.setAdapter(adaptadores);

    }
}