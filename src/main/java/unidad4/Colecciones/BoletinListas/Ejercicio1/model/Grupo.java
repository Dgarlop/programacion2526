package unidad4.Colecciones.BoletinListas.Ejercicio1.model;

import java.util.List;

public class Grupo {
    private int identificador;
    private String descripcion;
    private List<Estudiante> listaEstudiantes;
    //private Tutor tutor;
    private String aula;

    public Grupo(int identificador, String descripcion, List<Estudiante> listaEstudiantes, String aula) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.listaEstudiantes = listaEstudiantes;
        this.aula = aula;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                ", aula='" + aula + '\'' +
                '}';
    }
}
