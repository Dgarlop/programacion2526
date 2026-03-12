package unidad3.exepciones.boletinE3.ejercicio3.models;

import java.time.LocalDateTime;

public class Sensor {
    private int id;
    private static int contador;
    private TipoParametro parametro;
    private double max;
    private double min;
    private Lectura[] historial;

    public Sensor(int id, TipoParametro parametro, double max, double min, Lectura[] historial) {
        this.id = contador;
        contador++;
        this.parametro = parametro;
        this.max = max;
        this.min = min;
        this.historial = historial;
    }

    void registrarLectura (LocalDateTime horaYfecha, double d){
        if(d<max && d>min){

        }
    }
}
