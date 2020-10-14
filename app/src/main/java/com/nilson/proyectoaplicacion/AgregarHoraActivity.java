package com.nilson.proyectoaplicacion;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class AgregarHoraActivity extends AppCompatActivity {


   private TextView fechainicio,fechatermino;
   private DatePickerDialog.OnDateSetListener fechaescuchadorinicio,fechaescuchadortermino;


   private TextView eHora;
   private int hora,minutos;

   private Button btnguardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_hora);

        fechainicio = (TextView) findViewById(R.id.tvfechainicio);
        fechatermino = (TextView) findViewById(R.id.tvfechatermino);
        eHora = (TextView) findViewById(R.id.eHora);
        btnguardar = findViewById(R.id.btnguardar);
        //Escuchador de Hora.
        eHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            final Calendar calendar = Calendar.getInstance();
            hora=calendar.get(Calendar.HOUR_OF_DAY);
            minutos = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog = new TimePickerDialog(AgregarHoraActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int horadeldia, int min) {
                    eHora.setText(horadeldia + ":" + min);
                    }
                },hora,minutos,false);
                timePickerDialog.show();
            }
        });





        //escuchador de fecha inicial
        fechainicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendarioinicial = Calendar.getInstance();
                int dia = calendarioinicial.get(Calendar.DAY_OF_MONTH);
                int mes = calendarioinicial.get(Calendar.MONTH);
                int agno = calendarioinicial.get(Calendar.YEAR);



                DatePickerDialog dialog = new DatePickerDialog(AgregarHoraActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,fechaescuchadorinicio,agno,mes,dia);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

fechaescuchadorinicio = new DatePickerDialog.OnDateSetListener() {
    @Override
    public void onDateSet(DatePicker datePicker, int dia, int mes, int agno) {
        mes = mes+1;
        //Log.d(Tag, "Fecha dia/mes/año  :" + dia + " / " + mes + "/" + agno)
        String date = dia+"/"+mes+"/"+agno;
        fechainicio.setText(date);
        Toast.makeText(AgregarHoraActivity.this,"Fecha inicio"+date,Toast.LENGTH_LONG).show();
    }
};


//escuchador de fecha final
fechatermino.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Calendar calendariofinal = Calendar.getInstance();
        int dia = calendariofinal.get(Calendar.DAY_OF_MONTH);
        int mes = calendariofinal.get(Calendar.MONTH);
        int agno = calendariofinal.get(Calendar.YEAR);

        DatePickerDialog dialog = new DatePickerDialog(AgregarHoraActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,fechaescuchadortermino,agno,mes,dia);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
});

fechaescuchadortermino = new DatePickerDialog.OnDateSetListener() {
    @Override
    public void onDateSet(DatePicker datePicker, int agno, int mes, int dia) {
    mes = mes+1;
    String datef = dia+"/"+mes+"/"+agno;

    String dias = String.valueOf(dia);
    String meses = String.valueOf(mes);
    String agnos = String.valueOf(agno);



        fechatermino.setText(datef);

        Toast.makeText(AgregarHoraActivity.this,dias+"/"+meses+"/"+agnos+"  ",Toast.LENGTH_LONG).show();



    }
};





btnguardar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        String fechai = fechainicio.getText().toString();
        String fechaf = fechatermino.getText().toString();
        String alarm = eHora.getText().toString();

        informacionDatos datoscompletos = new informacionDatos(fechaf,fechai,alarm);
        MainActivity.Arraydatos.add(datoscompletos);




    }
});










    }
}