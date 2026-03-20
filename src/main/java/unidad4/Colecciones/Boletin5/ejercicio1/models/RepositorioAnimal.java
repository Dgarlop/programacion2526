package unidad4.Colecciones.Boletin5.ejercicio1.models;

import java.util.TreeSet;

public class RepositorioAnimal {
    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private TreeSet<Animal> listaAnimales;

    public RepositorioAnimal(String nombre, String lugar, double presupuesto) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuesto;
        this.listaAnimales = new TreeSet<>();
    }

    public void añadirAnimal(Animal a) {
        listaAnimales.add(a);
    }

    public void mostrarAnimales() {
        listaAnimales.forEach(System.out::println);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public TreeSet<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(TreeSet<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
}

