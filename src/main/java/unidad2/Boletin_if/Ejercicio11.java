package unidad2.Boletin_if;

import java.util.Scanner;

public class Ejercicio11 {
    static void main() {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int num1 = numero1.nextInt();
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Dame el segundo número");
        int num2 = numero2.nextInt();
        Scanner numero3 = new Scanner(System.in);
        System.out.println("Dame el tercer número");
        int num3 = numero3.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println("El numero 1 es el mayor");
        else if (num2 > num1 && num2 > num3)
            System.out.println("El numero 2 es el mayor");
        else
            System.out.println("El numero 3 es el mayor");
    }
}
