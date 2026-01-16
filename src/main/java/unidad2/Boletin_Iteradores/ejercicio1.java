package unidad2.Boletin_Iteradores;

import java.util.Scanner;

public class ejercicio1 {
    //ejercicio2
    static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int num1 = numero.nextInt();
        String cadena = "";
        for (int i = 0; i < num1; i ++ ){
            cadena = cadena + "*";
            System.out.println(cadena);
        }
    }

}
