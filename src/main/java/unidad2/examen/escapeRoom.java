package unidad2.examen;

import java.util.Scanner;
import java.util.Random;

public class escapeRoom {
    static void main(String[] args) {
        escapeRoom ref = new escapeRoom();
        String[] salas = {"BLOQUEADA", "BLOQUEADA", "BLOQUEADA", "BLOQUEADA", "BLOQUEADA"};
        int[] codigoSalas = new int[5];
        Scanner sc = new Scanner(System.in);

        String eleccion = " ";
        while (eleccion != "S") {
            ref.menu();
            eleccion = sc.nextLine();
            switch (eleccion) {
                case "G":
                    ref.GenerarPartidas(codigoSalas);
                    break;

                case "A":
                    ref.AbrirSala(codigoSalas, salas);
                    break;

                case "E":
                    ref.EstadoEscapeRoom(salas);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }

    }

    public void menu() {
        System.out.println("G.Generar Partida");
        System.out.println("A.Intentar abrir una sala");
        System.out.println("E.Estado del Escape Room");
        System.out.println("S. Salir");
    }

    public void GenerarPartidas(int[] salas) {
        Random codigos = new Random();
        int codigosSala = codigos.nextInt(0, 6);
        for (int i = 0; i < salas.length; i++) {
            salas[i] = codigosSala;
        }
    }

    public void EstadoEscapeRoom(String[] salas) {
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Sala " + i + " : " + salas[i]);
        }
    }

    public void AbrirSala(int[] CodigoSala, String[] salas) {
        Scanner sc = new Scanner(System.in);
        int contadorIntentos = 0;
        System.out.println("Elige el numero de sala: 0 - 4");
        int eleccion = sc.nextInt();
        while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4 && eleccion != 0) {
            System.out.println("Elige el numero de sala: 1 - 4");
            eleccion = sc.nextInt();
        }
        for (int i = 0; i <= eleccion; i++) {
            if (i == eleccion) {
                if (salas[i] == "BLOQUEADA") {
                    while (contadorIntentos !=3) {
                        System.out.println("Ingresa el codigo numerico de la sala");
                        System.out.println("Desbloqueando sala: " + i);
                        int codigosIngresado = sc.nextInt();
                        if (codigosIngresado == CodigoSala[i]) {
                            System.out.println("Codigo Correcto");
                            System.out.println("Sala " + i + " desbloqueada");
                            salas[i] = "DESBLOQUEADA";
                            contadorIntentos = 3;
                        } else {
                            contadorIntentos++;
                            System.out.println("Codigo Incorrecto");
                            System.out.println("Introduce otro numero de entre el 0 y el 6");
                            if (contadorIntentos == 3) {
                                salas[i] = "INVALIDA";
                                System.out.println("Sala " + i + " ha sido invalida y ya no puedes completar el juego");
                            }
                        }
                    }
                }else if (salas[i] == "DESBLOQUEADA") {
                    System.out.println("Sala " + i + " desbloqueada");
                } else {
                    System.out.println("Sala " + i + " ha sido invalida y ya no puedes completar el juego");
                }
                contadorIntentos = 0;
            }
        }
    }
}

