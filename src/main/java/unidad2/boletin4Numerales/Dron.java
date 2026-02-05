package unidad2.boletin4Numerales;

public class Dron {
    int identificador;
    int bateria;
    int carga_maxima;
    Estado estadoDron;
    PaqueteRuta ruta;
    public enum Estado {
        EN_REPOSO, EN_RUTA, CARGANDO, FUERA_DE_SERVICIO
    }

    public void cargaBateria() {
        if (bateria < 50) {
            estadoDron = Estado.CARGANDO;
            System.out.println("Cargando bateria");
        }
        bateria = 100;
        System.out.println("Bateria cargada, dron en reposo");
        estadoDron = Estado.EN_REPOSO;
    }

    public void asignarRuta(PaqueteRuta ruta){
        if (estadoDron == Estado.EN_REPOSO){
            bateria = bateria - 40;
            estadoDron = Estado.EN_RUTA;
            this.ruta = ruta;
        }
        else{
            System.out.println("Bateria baja o el dron esta en ruta ");

        }
    }

    @Override
    public String toString() {
        return "Dron: " +
                "identificador: " + identificador +
                ", bateria: " + bateria +
                ", estadoDron: " + estadoDron +
                ", ruta: " + ruta.origen  + " a " + ruta.destino;
    }
}
