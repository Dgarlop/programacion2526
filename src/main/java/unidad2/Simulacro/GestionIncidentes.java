package unidad2.Simulacro;
import java.time.LocalDate;


public class GestionIncidentes {
    static void main(String[] args) {
        Equipo eq1 = new Equipo("Equipo1", "3C:AB:2E", "Windows",0);
        Incidente i1 = new Incidente(1, "Este es el incidente numero 1", null, Estado.ANALIZADA, Criticidad.GRAVE);
        Incidente i2 = new Incidente(2, "Este es el incidente numero 2", null, Estado.REGISTRADA, Criticidad.MEDIA);
        i1.setNombre(eq1);
        i2.setNombre(eq1);
        i1.setFechaApertura(LocalDate.now().minusDays(8));
        i2.setFechaApertura(LocalDate.now().minusDays(40));
        System.out.println(i1.esUrgente());
        System.out.println(i2.esUrgente());
        System.out.println(i1.toString());
        System.out.println(eq1.toString());
    }
}
