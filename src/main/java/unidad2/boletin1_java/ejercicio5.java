package unidad2.boletin1_java;

import java.util.Scanner;

public class ejercicio5 {
    static void main(String[] args) {
        ejercicio5 referencia = new ejercicio5();

        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduzca lo que has gastado: ");
        int cesta = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduzca la edad: ");
        int edad = num2.nextInt();

        String Premium = referencia.es_premium(cesta,edad);
        System.out.println(Premium);
    }
    public String es_premium (int cesta, int edad){
        String es = "No eres premium";
        if (cesta >= 50 || edad >= 65){
             es = "Eres premium";
        }
        else {
             es = "No eres premium";
        }
        return es;
    }
}
