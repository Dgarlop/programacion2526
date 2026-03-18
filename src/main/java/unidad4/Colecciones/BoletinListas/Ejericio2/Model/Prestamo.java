package unidad4.Colecciones.BoletinListas.Ejericio2.Model;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private int id;
    private Libro libro;
    private Usuario usuario;
    private LocalDate fecha;

    public Prestamo(int id, Libro libro, Usuario usuario, LocalDate fecha) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Prestamo prestamo)) return false;
        return Objects.equals(libro, prestamo.libro) && Objects.equals(usuario, prestamo.usuario) && Objects.equals(fecha, prestamo.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, usuario, fecha);
    }


}
