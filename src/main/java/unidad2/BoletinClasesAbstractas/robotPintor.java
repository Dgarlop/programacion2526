package unidad2.BoletinClasesAbstractas;

public class robotPintor extends robot{
    public robotPintor(int identificador, String modelo, double bateria, estadorobot estado, String combutible, String descripcion) {
        super(identificador, modelo, bateria, estado, combutible, descripcion);
    }

    @Override
    void ejecutar() {
        System.out.println("Aplica pintura a los vehículos de manera uniforme");
    }

    @Override
    boolean recargar() {
        System.out.println("Recargando por electricidad");
        return true;
    }
}
