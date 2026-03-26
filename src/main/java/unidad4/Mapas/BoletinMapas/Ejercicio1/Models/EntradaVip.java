package unidad4.Mapas.BoletinMapas.Ejercicio1.Models;

import java.time.LocalDate;

public class EntradaVip {
    private int codigoEntrada;
    private LocalDate fechaEntrada;
    private TipoEntrada tipo;
    private Estado estado;

    public EntradaVip(TipoEntrada tipo, int codigoEntrada, LocalDate fechaEntrada) {
        this.tipo = tipo;
        this.codigoEntrada = codigoEntrada;
        this.fechaEntrada = fechaEntrada;
        this.estado = Estado.ENVIADA;
    }

    public int getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(int codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public TipoEntrada getTipo() {
        return tipo;
    }

    public void setTipo(TipoEntrada tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public EntradaVip setEstado(Estado estado) {
        this.estado = estado;
        return null;
    }

    @Override
    public String toString() {
        return "EntradaVip{" +
                ", tipo=" + tipo +
                ", estado=" + estado +
                '}';
    }
}
