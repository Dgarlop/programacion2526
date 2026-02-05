package unidad2.boletin4Numerales;

public class PaqueteRuta {
    String origen;
    String destino;
    Double peso;
    EstadoPaquete estadoPaquete;
    public void modificaEstadoRuta(EstadoPaquete estadoPaquete) {
        estadoPaquete = EstadoPaquete.EN_REPARTO;

    }
    public enum EstadoPaquete{
        EN_PREPARACION, EN_REPARTO, RETRASADO, CANCELADO
    }
}
