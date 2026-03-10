package unidad2.examen.examenPOO;

public abstract class EntidadEstrangerThings {
    static int idEntidad;
    private String nombre;
    private Double saludBase;

    public EntidadEstrangerThings(String nombre, Double saludBase) {
        int contador = 0;
        contador++;
        this.idEntidad = contador;
        this.nombre = nombre;
        this.saludBase = saludBase;
    }
}
