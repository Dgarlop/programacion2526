package unidad2.Boletin_Match;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        //ejercicio6
        Scanner numero_nuevo = new Scanner(System.in);
        System.out.println("Dime el numero de habtacion");
        int nums = numero_nuevo.nextInt();
        switch (nums){
            case 1:
                System.out.println("Habitacion: 1.azul, Camas: 2, Planta: Primera");
                break;
            case 2:
                System.out.println("Habitacion: 2.roja, Camas: 1, Planta: Primera");
                break;
            case 3:
                System.out.println("Habitacion: 3.verde, Camas: 3, Planta: Segunda");
                break;
            case 4:
                System.out.println("Habitacion: 4.rosa, Camas: 2, Planta: Segunda");
                break;
            case 5:
                System.out.println("Habitacion: 5.gris, Camas: 1, Planta: Tercera");
                break;
            default:
                System.out.println("No existe es habitacion, solo hay 1-5");
                break;

        }
    }
}
