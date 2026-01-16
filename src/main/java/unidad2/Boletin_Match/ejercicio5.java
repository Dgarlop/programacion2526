package unidad2.Boletin_Match;

import java.util.Scanner;

public class ejercicio5 {
    static void main(String[] args) {
        //ejercicio 9
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int num1 = numero1.nextInt();
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Dame el segundo número");
        int num2 = numero2.nextInt();
        Scanner operacion = new Scanner(System.in);
        System.out.println("Dime el tipo de operacion: +, - , /, *");
        System.out.println("Pon @ para salir");
        String op= operacion.next();
        switch (op) {
            case "@":
                System.out.println("Saliendo...");
                break;
            case "+":
                int a = num1 + num2;
                System.out.println(a);
                break;
            case "-":
                int b = num1 - num2;
                System.out.println(b);
                break;
            case "/":
                int c = num1 / num2;
                System.out.println(c);
                break;
            case "*":
                int d = num1 * num2;
                System.out.println(d);
                break;
            default:
                System.out.println("Esta tipo de operacion no existe los tipo de operacion: +, - , /, *");
                System.out.println("Pon @ para salir");
                break;
        }
    }
}
