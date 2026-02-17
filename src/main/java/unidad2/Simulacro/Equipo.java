package unidad2.Simulacro;

import java.util.Objects;

public class Equipo {
    private String nombre;
    private String mac;
    private String sistemaOperativo;
    private int incidentes;

    public Equipo(String nombre, String mac, String sistemaOperativo, int incidentes) {
        this.nombre = nombre;
        this.mac = mac;
        this.sistemaOperativo = sistemaOperativo;
        this.incidentes = incidentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMac() {
        if (getMac() == this.mac){
            System.out.println("Son el mismo dispositivo");
        }
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(int incidentes) {
        this.incidentes = incidentes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return incidentes == equipo.incidentes && Objects.equals(nombre, equipo.nombre) && Objects.equals(mac, equipo.mac) && Objects.equals(sistemaOperativo, equipo.sistemaOperativo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, mac, sistemaOperativo, incidentes);
    }

    @Override
    public String toString() {
        return  "Nombre='" + nombre +
                ", mac='" + mac +
                ", incidentes=" + incidentes;
    }
}




