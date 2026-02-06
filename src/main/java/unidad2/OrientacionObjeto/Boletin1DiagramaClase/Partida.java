package unidad2.OrientacionObjeto.Boletin1DiagramaClase;

import java.util.Arrays;

public class Partida {
    private String nombreJuego;
    private Participantes[] participantes;
    private Participantes ganador;


    public Partida() {
        participantes = new Participantes[4];
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Participantes[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participantes[] participantes) {
        this.participantes = participantes;
    }

    public Participantes getGanador() {
        return ganador;
    }

    public void setGanador(Participantes ganador) {
        this.ganador = ganador;
    }

    public Participantes CalcularPuntuacion() {
        int puntuacion = 0;
        Participantes p1 = participantes[0];
        for (int i = 0; i < participantes.length; i++) {
            Participantes p = this.participantes[i];
            if (p.getPuntuacion() > puntuacion) {
                puntuacion = p.getPuntuacion();
                p1 = p;
            }

        }
        return p1;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "nombreJuego='" + nombreJuego + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                ", ganador=" + ganador +
                '}';
    }
}
