package unidad2.boletin4Numerales;

public class SistemasDeDron {
    static void main(String[] args) {
        Dron dr1 = new Dron();
        Dron dr2 = new Dron();
        PaqueteRuta paquete1 = new PaqueteRuta();
        PaqueteRuta paquete2 = new PaqueteRuta();
        PaqueteRuta paquete3 = new PaqueteRuta();

        paquete1.origen = "Sevilla";
        paquete1.destino = "Cordoba";
        paquete1.peso = 20.2;
        paquete1.estadoPaquete = PaqueteRuta.EstadoPaquete.EN_REPARTO;
        paquete2.origen = "Cordoba";
        paquete2.destino = "Sevilla";
        paquete2.peso = 18.5;
        paquete2.estadoPaquete = PaqueteRuta.EstadoPaquete.EN_REPARTO;
        paquete3.origen = "Sevilla";
        paquete3.destino = "Cadiz";
        paquete3.peso = 22.1;
        paquete3.estadoPaquete = PaqueteRuta.EstadoPaquete.EN_REPARTO;

        dr1.estadoDron = Dron.Estado.EN_REPOSO;
        dr1.identificador = 1;
        dr1.bateria = 100;
        dr1.carga_maxima = 100;
        dr1.asignarRuta(paquete1);
        dr2.estadoDron = Dron.Estado.EN_REPOSO;
        dr2.identificador = 1;
        dr2.bateria = 100;
        dr2.carga_maxima = 100;
        dr2.asignarRuta(paquete2);

        System.out.println(dr1.toString());
        System.out.println(dr2.toString());


    }
}
