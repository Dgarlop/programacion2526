package unidad4.Colecciones.BoletinListas.Ejericio3.Model;

import java.util.LinkedHashSet;

public class RepositorioPrestamos {
    LinkedHashSet<Prestamo> prestamos;

    public RepositorioPrestamos() {
        this.prestamos = new LinkedHashSet<>();
    }

    public void addPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }
}
