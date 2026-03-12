package unidad4.Colecciones.BoletinListas.model;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int identificador;

    public Estudiante(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }
    public Estudiante() {}

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Estudiante that)) return false;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificador=" + identificador +
                '}';
    }
}
