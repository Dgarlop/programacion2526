package unidad4.Colecciones.BoletinListas.Ejericio2.Model;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RepositorioPrestamos {
    LinkedHashSet<Prestamo> prestamos;

    public RepositorioPrestamos() {
        this.prestamos = new LinkedHashSet<>();
    }

    public void addPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }
}
