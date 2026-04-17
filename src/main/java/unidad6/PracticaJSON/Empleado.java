package unidad6.PracticaJSON;

import java.util.Objects;

public class Empleado {
    private String identificador;
    private String nombreApellido;
    private int edad;
    private String empresa;

    public Empleado(String identificador, String nombreApellido, int edad, String empresa) {
        this.identificador = identificador;
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.empresa = empresa;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificador='" + getIdentificador() + '\'' +
                ", nombreApellido='" + getNombreApellido() + '\'' +
                ", edad=" + getEdad() +
                ", empresa='" + getEmpresa() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(identificador, empleado.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }
}
