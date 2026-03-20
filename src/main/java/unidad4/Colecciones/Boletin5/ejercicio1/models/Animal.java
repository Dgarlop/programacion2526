package unidad4.Colecciones.Boletin5.ejercicio1.models;
import java.time.LocalDate;
import java.util.Objects;
public class Animal implements Comparable<Animal> {
    private String id;
    private String nombre;
    private String especie;
    private int edad;
    private Comida alimentacion;
    private LocalDate fechaNacimiento;
    private double peso;
    private Medio medio;
    private Gestacion gestacion;

    public Animal(String id, String nombre, LocalDate fechaNacimiento, Medio medio, Comida alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.medio = medio;
        this.alimentacion = alimentacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Comida getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Comida alimentacion) {
        this.alimentacion = alimentacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public Gestacion getGestacion() {
        return gestacion;
    }

    public void setGestacion(Gestacion gestacion) {
        this.gestacion = gestacion;
    }

    @Override
    public int compareTo(Animal otro) {
        int res = this.nombre.compareToIgnoreCase(otro.nombre);
        if (res == 0) res = this.id.compareTo(otro.id);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return String.format("ID: %s | Nom: %s | Nac: %s | Medio: %s | Dieta: %s",
                id, nombre, fechaNacimiento, medio, alimentacion);
    }
}