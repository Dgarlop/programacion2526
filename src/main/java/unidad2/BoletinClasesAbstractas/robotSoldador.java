package unidad2.BoletinClasesAbstractas;

public class robotSoldador extends robot{
    private double temperatura;
    private String seguridad;

    public robotSoldador(int identificador, String modelo, double bateria, estadorobot estado, String combutible, String descripcion) {
        super(identificador, modelo, bateria, estado, combutible, descripcion);
    }


    @Override
    void ejecutar() {
        System.out.println("Soldaduras precisas en la carrocería del automóvil");
    }

    @Override
    boolean recargar() {
        boolean recargar = false;
        if(getEstado().equals(estadorobot.APAGADO)){
            System.out.println("Recargando por electricidad");
            recargar = true;
        }
        else {
            System.out.println("Estoy encendido y no puedo recargar");
        }
        return recargar;
    }
}
