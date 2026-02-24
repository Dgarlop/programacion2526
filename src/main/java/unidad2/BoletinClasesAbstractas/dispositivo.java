package unidad2.BoletinClasesAbstractas;

import java.time.LocalDate;
import java.util.Objects;

public class dispositivo {
    private String id;
    private String mac;
    private estado estado;
    private LocalDate actualizacion;

    void conectarwifi(){
        //to do , mostar la informacion de la coneccion
    }

    boolean pendienteActulizacion(){
        // to do, depende del dispositivo tiene mas o menos frecuencia
        return true;
    }

    void apagar(){
        estado = estado.OFF;
        System.out.println("Apagando dispostivo...");
        System.out.println("Dispositivo apagado" + estado);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        dispositivo that = (dispositivo) o;
        return Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mac);
    }
}
