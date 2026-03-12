package unidad3.exepciones.boletinE3.ejercicio3.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lectura {
    private LocalDateTime horaYfecha;
    private double cantidadLeida;
    private boolean valida;

    public LocalDateTime getHoraYfecha() {
        return horaYfecha;
    }

    public void setHoraYfecha(LocalDateTime horaYfecha) {
        this.horaYfecha = horaYfecha;
    }

    public double getCantidadLeida() {
        return cantidadLeida;
    }

    public void setCantidadLeida(double cantidadLeida) {
        this.cantidadLeida = cantidadLeida;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }
}
