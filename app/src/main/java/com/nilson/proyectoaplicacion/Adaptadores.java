package com.nilson.proyectoaplicacion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptadores  extends RecyclerView.Adapter<Adaptadores.MyViewHolderinformacionDatos> {

    private ArrayList<informacionDatos> infodato;

    public Adaptadores(ArrayList<informacionDatos> infodato) {
        this.infodato = infodato;
    }

    @NonNull
    @Override
    public Adaptadores.MyViewHolderinformacionDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_modelo_lista_ver,parent,false);

        return new MyViewHolderinformacionDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderinformacionDatos holder, int position) {

        holder.cargardatos(infodato.get(position));

    }

    @Override
    public int getItemCount() {
        return infodato.size();
    }




    public class MyViewHolderinformacionDatos extends RecyclerView.ViewHolder {

        TextView textViewfechainicial,textViewfechatermino,textViewhora;


        public MyViewHolderinformacionDatos(@NonNull View itemView) {
            super(itemView);

            textViewfechainicial = itemView.findViewById(R.id.textViewfechainicial);
            textViewfechatermino = itemView.findViewById(R.id.textViewfechatermino);
            textViewhora = itemView.findViewById(R.id.textViewhora);



        }


        public void cargardatos(informacionDatos informacionDatos){

            textViewfechainicial.setText(informacionDatos.getFechainicial());
            textViewfechatermino.setText(informacionDatos.getFechafinal());
            textViewhora.setText(informacionDatos.getAlarma());



        }



    }
}
