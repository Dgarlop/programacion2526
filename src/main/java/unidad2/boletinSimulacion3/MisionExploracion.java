package unidad2.boletinSimulacion3;

public class MisionExploracion extends Mision {
    private String destino;
    private int tripulacion;

    public MisionExploracion(int codigoNumerico, String nombreClave, Nave naveAsignada, Estado estado, String destino, int tripulacion) {
        super(codigoNumerico, nombreClave, naveAsignada, estado);
        this.destino = destino;
        this.tripulacion = tripulacion;
    }

    @Override
    public String toString() {
        return "MisionExploracion{" +
                "nombre= " + getNombreClave() + " naveAsignada= " + getNaveAsignada() +
                " destino='" + destino + '\'' +
                ", tripulacion=" + tripulacion +
                '}';
    }
}
