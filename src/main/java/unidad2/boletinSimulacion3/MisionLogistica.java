package unidad2.boletinSimulacion3;

public class MisionLogistica extends Mision {
    private double carga;

    public MisionLogistica(int codigoNumerico, String nombreClave, Nave naveAsignada, Estado estado, double carga) {
        super(codigoNumerico, nombreClave, naveAsignada, estado);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "MisionLogistica{" +
                "nombre= " + getNombreClave() + " naveAsignada= " + getNaveAsignada()+
                " carga=" + carga +
                '}';
    }
}
