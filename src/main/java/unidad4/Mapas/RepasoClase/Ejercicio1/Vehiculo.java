package unidad4.Mapas.RepasoClase.Ejercicio1;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Objects;

public class Vehiculo {
    private String idBastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private LocalDate fabricacion;
    private String propietario;
    private LinkedList<Vehiculo> historial;

    public Vehiculo(String idBastidor, String matricula, String marca, String modelo, LocalDate fabricacion, String propietario) {
        this.idBastidor = idBastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.propietario = propietario;
    }

    public String getIdBastidor() {
        return idBastidor;
    }

    public void setIdBastidor(String idBastidor) {
        this.idBastidor = idBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public LinkedList<Vehiculo> getHistorial() {
        return historial;
    }

    public void setHistorial(LinkedList<Vehiculo> historial) {
        this.historial = historial;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(idBastidor, vehiculo.idBastidor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idBastidor);
    }
}
