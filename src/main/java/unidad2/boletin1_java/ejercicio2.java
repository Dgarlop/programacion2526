package unidad2.boletin1_java;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        ejercicio2 referencia = new ejercicio2();

        Scanner numero = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int num1 = numero.nextInt();

        Scanner numero2 = new Scanner(System.in);
        System.out.println("Dame el segundo número");
        int num2 = numero2.nextInt();

        int resMulti = referencia.multiplicar(num1,num2);
        System.out.println(resMulti);
    }
    public int multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
}
