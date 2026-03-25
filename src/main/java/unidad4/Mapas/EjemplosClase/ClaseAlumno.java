package unidad4.Mapas.EjemplosClase;

import unidad4.Colecciones.BoletinListas.Ejercicio1.model.Estudiante;

import java.util.Objects;

public class ClaseAlumno {
    private String nombre;
    private int identificador;
    private String dni;

    public ClaseAlumno(String nombre, int identificador, String dni) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClaseAlumno that = (ClaseAlumno) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "ClaseAlumno{" +
                "nombre='" + nombre + '\'' +
                ", identificador=" + identificador +
                ", dni='" + dni + '\'' +
                '}';
    }
}
