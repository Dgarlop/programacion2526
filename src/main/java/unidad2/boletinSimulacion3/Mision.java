package unidad2.boletinSimulacion3;
import java.time.LocalDate;

abstract class Mision {
    private int codigoNumerico;
    private String nombreClave;
    private LocalDate lanzamiento;
    private Nave naveAsignada;
    private Estado estado;

    public Mision(int codigoNumerico, String nombreClave, Nave naveAsignada, Estado estado) {
        this.codigoNumerico = codigoNumerico;
        this.nombreClave = nombreClave;
        this.naveAsignada = naveAsignada;
        this.estado = estado;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Nave getNaveAsignada() {
        return naveAsignada;
    }

    public void setNaveAsignada(Nave naveAsignada) {
        this.naveAsignada = naveAsignada;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
