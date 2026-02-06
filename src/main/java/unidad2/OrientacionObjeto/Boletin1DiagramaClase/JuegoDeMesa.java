package unidad2.OrientacionObjeto.Boletin1DiagramaClase;

public class JuegoDeMesa {
    static void main(String[] args) {
        Partida p = new Partida();
        Participantes j = new Participantes("Jugador1",  "Benito_Camela", 21,  200);
        Participantes j2 = new Participantes("Jugador2",  "Rosa_Melano", 22,  100);
        Participantes j3 = new Participantes("Jugador3",  "Querri_Caverga", 25,  200);
        Participantes j4 = new Participantes("Jugador4",  "Elver_Galarga", 20,  180);


        Participantes[] participantes = {j, j2, j3, j4};
        p.setParticipantes(participantes);
        System.out.println(p.CalcularPuntuacion());
    }

}
