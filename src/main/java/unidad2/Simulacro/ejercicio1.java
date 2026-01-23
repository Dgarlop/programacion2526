package unidad2.Simulacro;

import java.util.Scanner;
import java.util.Random;

public class ejercicio1 {
    static void main(String[] args) {
        ejercicio1 ref = new ejercicio1();
        Scanner sc = new Scanner(System.in);
        String [] historial = new String[10];
        int numPartidas = 0;
        int neto = 0;
        ref.menu();
        int eleccion = sc.nextInt();
        while(eleccion!=3){
            switch (eleccion) {
                case 1:
                    numPartidas++;
                    String partida ="En la jugada " + numPartidas + ref.apostar(neto);
                    System.out.println(partida);
                    ref.grabarHistorial(historial, numPartidas, partida);
                    break;
                case 2:
                    ref.mostrarHistorial(historial, numPartidas);
                    break;
            }
            ref.menu();
            eleccion = sc.nextInt();
        }
        System.out.println(neto);
    }
    public void menu(){
        System.out.println("1. Apostar");
        System.out.println("2. Mostar Historial");
        System.out.println("3. Retirarse");
    }
    public String apostar(int neto){
        Random aleatorio = new Random();
        int dado1 =  aleatorio.nextInt(6)+1;
        int dado2 =  aleatorio.nextInt(6)+1;
        int suma = dado1+dado2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica que numero quieres apostar: ");
        int numero = sc.nextInt();
        System.out.println("Indica que cantidad quieres apostar: ");
        int cantidad = sc.nextInt();
        int ganancia = 0;
        int perdida = 0;
        String partida = "";
        if (suma == numero){
            partida =" aposto por el valor " + numero + " y sumo " + suma + ", ganando " + cantidad + "€";
            ganancia= ganancia + cantidad;
        }else {
            partida =" aposto por el valor " + numero + " y sumo " + suma + ", perdio " + cantidad + "€";
            perdida= perdida + cantidad;
        }
        neto = ganancia - perdida ;

        return partida;

    }
    public void mostrarHistorial(String[] historial , int numPartidas){
        for(int i=1;i<=numPartidas;i++){
            System.out.println(historial[i]);
        }

    }
    public void grabarHistorial(String [] historial , int numPartidas, String partida){
        historial[numPartidas]=partida;

    }
}


