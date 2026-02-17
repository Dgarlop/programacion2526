package unidad2.OrientacionObjeto.UD3HERENCIAS;

import java.util.Objects;

public class astro {
    private String nombre;
    private double masa;
    private double diametero;
    private double rotacion;
    private double traslacion;
    private double distacioaMedia;

    public astro(String nombre, double masa, double diametero, double rotacion, double traslacion, double distacioaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametero = diametero;
        this.rotacion = rotacion;
        this.traslacion = traslacion;
        this.distacioaMedia = distacioaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametero() {
        return diametero;
    }

    public void setDiametero(double diametero) {
        this.diametero = diametero;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getTraslacion() {
        return traslacion;
    }

    public void setTraslacion(double traslacion) {
        this.traslacion = traslacion;
    }

    public double getDistacioaMedia() {
        return distacioaMedia;
    }

    public void setDistacioaMedia(double distacioaMedia) {
        this.distacioaMedia = distacioaMedia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        astro astros = (astro) o;
        return Double.compare(masa, astros.masa) == 0 && Double.compare(diametero, astros.diametero) == 0 && Double.compare(rotacion, astros.rotacion) == 0 && Double.compare(traslacion, astros.traslacion) == 0 && Double.compare(distacioaMedia, astros.distacioaMedia) == 0 && Objects.equals(nombre, astros.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, masa, diametero, rotacion, traslacion, distacioaMedia);
    }

    @Override
    public String toString() {
        return "astros{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", diametero=" + diametero +
                ", rotacion=" + rotacion +
                ", traslacion=" + traslacion +
                ", distacioaMedia=" + distacioaMedia +
                '}';
    }

    void muestra(){
        System.out.println("Mostrando la informacion del astro: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Diametero: " + diametero);
        System.out.println("Rotacion: " + rotacion);
        System.out.println("Traslacion: " + traslacion);
        System.out.println("DistacioaMedia: " + distacioaMedia);
    }
}
