package unidad2.boletin1_java;

import java.util.Scanner;

public class ejercicio7 {
    static void main(String[] args) {
        ejercicio7 objeto = new ejercicio7();
        Scanner numero = new Scanner(System.in);
        System.out.println("Dime el multiplo que quieres saber: ");
        int num = numero.nextInt();
        objeto.imprumeMultiplos(num);
    }
    public void imprumeMultiplos(int numero){
        for (int i = 1; i <= 10 ; i++){
            int multiplos = i * numero;
            System.out.println(multiplos);
        }

    }
}
