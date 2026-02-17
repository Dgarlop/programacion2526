package unidad2.OrientacionObjeto.UD3HERENCIAS;

import java.util.Objects;

public class satelite {
    private String nombre;
    private Planeta planeta;
    private double masaCuerpo;
    private double diametroMedio;
    private double distaciaPlaneta;

    public satelite(String nombre, Planeta planeta, double masaCuerpo, double diametroMedio, double distaciaPlaneta) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.masaCuerpo = masaCuerpo;
        this.diametroMedio = diametroMedio;
        this.distaciaPlaneta = distaciaPlaneta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
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

    public double getDistaciaPlaneta() {
        return distaciaPlaneta;
    }

    public void setDistaciaPlaneta(double distaciaPlaneta) {
        this.distaciaPlaneta = distaciaPlaneta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        satelite satelite = (satelite) o;
        return Double.compare(masaCuerpo, satelite.masaCuerpo) == 0 && Double.compare(diametroMedio, satelite.diametroMedio) == 0 && Double.compare(distaciaPlaneta, satelite.distaciaPlaneta) == 0 && Objects.equals(nombre, satelite.nombre) && Objects.equals(planeta, satelite.planeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, planeta, masaCuerpo, diametroMedio, distaciaPlaneta);
    }

    public void muestra(){
        System.out.println("Muestrando satelite...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Planeta: " + planeta.getNombre());
        System.out.println("Masa cuerpo: " + masaCuerpo);
        System.out.println("Diametro medio: " + diametroMedio);
        System.out.println("Distacia palneta: " + distaciaPlaneta);

    }
}
