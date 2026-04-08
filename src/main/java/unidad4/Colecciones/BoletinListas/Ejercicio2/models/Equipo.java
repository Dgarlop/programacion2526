package unidad4.Colecciones.BoletinListas.Ejercicio2.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Equipo {
    private String nombre;
    private ArrayList<Alumno> alumno = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<Alumno> alumno) {
        this.alumno = alumno;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public void add (Alumno alum) {
        this.alumno.add(alum);
    }
    public void remove (Alumno alum) {
        this.alumno.remove(alum);
    }
    public String buscar (Alumno alum) {
        String resultado = null;
        if(this.alumno.contains(alum)) {
            resultado = alum.toString();
        }
        return resultado;
    }
    public void mostrar () {
        System.out.println(alumno);

    }

    public void union (Equipo eAdd) {
        alumno.addAll(eAdd.getAlumno());
        System.out.println(alumno);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", alumno=" + alumno +
                '}';
    }
}
