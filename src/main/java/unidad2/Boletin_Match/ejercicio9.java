package unidad2.Boletin_Match;
import java.util.Random;
import java.util.Scanner;

public class ejercicio9 {
    static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(5);
        int num2 = random.nextInt(5);
        System.out.println(num1);
        System.out.println(num1);

        int suma_numeros = (num1+num2);

        Scanner suma = new Scanner(System.in);
        System.out.println("Calcule la suma");
        int resp = suma.nextInt();
        while (resp != suma_numeros){
            System.out.println("Calcule la suma");
            resp = suma.nextInt();
        }
        System.out.println("Has acertado");
    }
}
