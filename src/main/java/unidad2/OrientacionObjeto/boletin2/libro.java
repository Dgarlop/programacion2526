package unidad2.OrientacionObjeto.boletin2;

public class libro {
    String titulo;
    String autor;
    int numPaginas;
    int isbn;

    @Override
    public String toString() {
        return "libro: " +
                "titulo='" + titulo + '\'' +
                ", numPaginas='" + numPaginas + '\'';
    }
}


