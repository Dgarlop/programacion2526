package unidad2.boletinSimulacion3;

import java.util.Objects;

public class Nave {
    private String codigoRegistro;
    private String modelo;
    private int hVuelo;

    public Nave(String codigoRegistro, String modelo, int hVuelo) {
        this.codigoRegistro = codigoRegistro;
        this.modelo = modelo;
        this.hVuelo = hVuelo;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int gethVuelo() {
        return hVuelo;
    }

    public void sethVuelo(int hVuelo) {
        this.hVuelo = hVuelo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Objects.equals(codigoRegistro, nave.codigoRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoRegistro);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "codigoRegistro='" + codigoRegistro + '\'' +
                ", modelo='" + modelo + '\'' +
                ", hVuelo=" + hVuelo +
                '}';
    }
}
