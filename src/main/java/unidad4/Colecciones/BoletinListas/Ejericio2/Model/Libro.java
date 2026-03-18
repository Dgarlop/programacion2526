package unidad4.Colecciones.BoletinListas.Ejericio2.Model;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int annoPublicacion;
    private Estado estado;

    public Libro(String titulo, String autor, String genero, int annoPublicacion, Estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.annoPublicacion = annoPublicacion;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", annoPublicacion=" + annoPublicacion +
                ", estado=" + estado +
                '}';
    }
}