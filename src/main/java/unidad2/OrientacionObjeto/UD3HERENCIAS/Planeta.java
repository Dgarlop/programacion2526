package unidad2.OrientacionObjeto.UD3HERENCIAS;

import java.util.Objects;

public class Planeta {
    private String nombre;
    private double masaCuerpo;
    private double diametroMedio;
    private double rotacion;
    private double traslacion;
    private double distacioaMedia;
    private double distanciaSol;

    public Planeta(String nombre, double masaCuerpo, double diametroMedio, double rotacion, double traslacion, double distacioaMedia, double distanciaSol) {
        this.nombre = nombre;
        this.masaCuerpo = masaCuerpo;
        this.diametroMedio = diametroMedio;
        this.rotacion = rotacion;
        this.traslacion = traslacion;
        this.distacioaMedia = distacioaMedia;
        this.distanciaSol = distanciaSol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasaCuerpo() {
        return masaCuerpo;
    }

    public void setMasaCuerpo(double masaCuerpo) {
        this.masaCuerpo = masaCuerpo;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
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

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Planeta planeta = (Planeta) o;
        return masaCuerpo == planeta.masaCuerpo && diametroMedio == planeta.diametroMedio && rotacion == planeta.rotacion && traslacion == planeta.traslacion && distacioaMedia == planeta.distacioaMedia && distanciaSol == planeta.distanciaSol && Objects.equals(nombre, planeta.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, masaCuerpo, diametroMedio, rotacion, traslacion, distacioaMedia, distanciaSol);
    }

    public void muestra(){
        System.out.println("Mostrando la informacion del planeta: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa cuerpo: " + masaCuerpo);
        System.out.println("Diametro medio: " + diametroMedio);
        System.out.println("Rotacion: " + rotacion);
        System.out.println("Traslacion: " + traslacion);
        System.out.println("Distacioa media: " + distacioaMedia);
        System.out.println("Distancia sol: " + distanciaSol);
    }
}
