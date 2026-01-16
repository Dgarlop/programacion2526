package unidad2.Reto;

import java.util.Scanner;

public class Reto_Arbol {
    static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int nivel = numero.nextInt();
        int posicion = 3;
        String arbol = "";
        String cadena = "*";
        String espacio = " " + " " + " ";
        for (int i = 0; i <= nivel; i++) {
            if (i == 3){
                arbol = cadena + espacio + cadena;
                System.out.println(arbol);
                posicion = -1;
            }
            else{
                System.out.println(" ");
            }
        }
    }
}
