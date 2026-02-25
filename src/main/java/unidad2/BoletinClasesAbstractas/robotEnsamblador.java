package unidad2.BoletinClasesAbstractas;

public class robotEnsamblador extends robot{
    public robotEnsamblador(int identificador, String modelo, double bateria, estadorobot estado, String combutible, String descripcion) {
        super(identificador, modelo, bateria, estado, combutible, descripcion);
    }

    @Override
    void ejecutar() {
        System.out.println("Ensamblar piezas");
    }

    @Override
    boolean recargar() {
        boolean recargar = false;
        if(getEstado().equals(estadorobot.APAGADO)){
            System.out.println("Recargando por gasolina");
            recargar = true;
        }
        else {
            System.out.println("Estoy encendido y no puedo recargar");
        }
        return recargar;
    }
}
