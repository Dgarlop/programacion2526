package unidad2.Boletin_Tabla;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Ejercicio3 referecncia = new Ejercicio3();
        int[] listaNumero = {1, 3, 4, 7, 9};
        Scanner pnum = new Scanner(System.in);
        System.out.println("Numero que quieras buscar: ");
        int numero = pnum.nextInt();
        int posicion = referecncia.buscarNumero(numero, listaNumero);

    }

    public int buscarNumero(int num, int [] lista) {
        int valor = 0;
        for (int i = 0; i < lista.length; i++) {
            valor = i;
            if (lista[i] == num) {
                System.out.println("esta aqui");
                System.out.println(i);
            }
            else {
                System.out.println("o");
                System.out.println(i);

            }

        }

        return valor;
    }
}


