package unidad2.boletinSimulacion3;

import java.util.Objects;

public class Comandante {
    private String DNI;
    private String nombre;
    private Rango rango;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Comandante that = (Comandante) o;
        return Objects.equals(DNI, that.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }
}
