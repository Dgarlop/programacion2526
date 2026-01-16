package unidad2.Boletin_Match;

import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        //ejercicio 8
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int num1 = numero1.nextInt();
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Dame el segundo número");
        int num2 = numero2.nextInt();
        Scanner operacion = new Scanner(System.in);
        System.out.println("Dime el tipo de operacion: suma, resta , dividir, murtiplicar");
        String op= operacion.next();
        switch (op) {
            case "suma":
                int a = num1 + num2;
                System.out.println(a);
                break;
            case "resta":
                int b = num1 - num2;
                System.out.println(b);
                break;
            case "dividir":
                int c = num1 / num2;
                System.out.println(c);
                break;
            case "murtiplicar":
                int d = num1 * num2;
                System.out.println(d);
                break;
            default:
                System.out.println("Esta tipo de operacion no existe los tipo de operacion: suma, resta , dividir, murtiplicar");
                break;
        }
        }
    }
