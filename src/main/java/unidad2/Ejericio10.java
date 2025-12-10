package unidad2;

import java.util.Scanner;

public class Ejericio10 {
    static void main() {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int num1 = numero1.nextInt();
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Dame el segundo número");
        int num2 = numero2.nextInt();
        if (num2 != 0) {
            int division = num1 / num2;
            System.out.println("El resultado es");
            System.out.println(division);
        }
        else {
            System.out.println("El segundo numero es cero y no se puede dividir");
        }
        }
    }

