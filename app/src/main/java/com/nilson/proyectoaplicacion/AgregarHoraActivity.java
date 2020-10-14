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


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_hora);

        fechainicio = (TextView) findViewById(R.id.tvfechainicio);
        fechatermino = (TextView) findViewById(R.id.tvfechatermino);
        eHora = (TextView) findViewById(R.id.eHora);

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
                Calendar calendario = Calendar.getInstance();
                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH);
                int agno = calendario.get(Calendar.YEAR);
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
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int agno = calendario.get(Calendar.YEAR);
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




    if(Integer.parseInt(dias) <= dia){
        fechatermino.setText(datef);
        //Toast.makeText(AgregarHoraActivity.this,"Fecha termino : "+datef,Toast.LENGTH_LONG).show();
        Toast.makeText(AgregarHoraActivity.this,dias+"/"+meses+"/"+agnos+"  ",Toast.LENGTH_LONG).show();
    }else {



       Toast.makeText(AgregarHoraActivity.this,"El dia ingresado no es valido"+"dias"+"",Toast.LENGTH_LONG).show();

    }


    }
};
















    }
}