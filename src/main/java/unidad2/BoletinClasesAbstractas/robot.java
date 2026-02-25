package unidad2.BoletinClasesAbstractas;

import java.util.Objects;

abstract class robot {
    private int identificador;
    private String modelo;
    private double bateria;
    private estadorobot estado;
    private String combutible;
    private String descripcion;
    private static int contador;

    public robot(int identificador, String modelo, double bateria, estadorobot estado, String combutible, String descripcion) {
        contador = contador + 1;
        this.identificador = contador;
        this.modelo = modelo;
        this.bateria = bateria;
        this.estado = estado;
        this.combutible = combutible;
        this.descripcion = descripcion;
    }

    abstract void ejecutar();
    abstract boolean recargar();


    public void obtenerBateria(){
        if (bateria > 10){
            System.out.println("Tiene un: " + bateria);
        }
        else{
            System.out.println("No tiene bateria suficinete: " + bateria);
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public estadorobot getEstado() {
        return estado;
    }

    public void setEstado(estadorobot estado) {
        this.estado = estado;
    }

    public String getCombutible() {
        return combutible;
    }

    public void setCombutible(String combutible) {
        this.combutible = combutible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        robot robot = (robot) o;
        return Objects.equals(identificador, robot.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    @Override
    public String toString() {
        return "robot{" +
                "identificador='" + identificador + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estado=" + estado +
                ", bateria=" + bateria +
                '}';
    }
}
