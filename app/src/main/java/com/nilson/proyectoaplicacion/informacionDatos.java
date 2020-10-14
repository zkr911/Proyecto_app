package com.nilson.proyectoaplicacion;

import java.util.Date;

public class informacionDatos {


    String fechafinal;
    String fechainicial;
    String alarma;


    public informacionDatos(String fechafinal, String fechainicial, String alarma) {
        this.fechafinal = fechafinal;
        this.fechainicial = fechainicial;
        this.alarma = alarma;
    }


    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(String fechainicial) {
        this.fechainicial = fechainicial;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }
}
