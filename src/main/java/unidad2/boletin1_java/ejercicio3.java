package unidad2.boletin1_java;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        ejercicio3 referencia = new ejercicio3();

        Scanner numero = new Scanner(System.in);
        System.out.println("Dame el alto");
        float alto = numero.nextFloat();

        Scanner numero2 = new Scanner(System.in);
        System.out.println("Dame el ancho");
        float ancho = numero2.nextFloat();

        float resMulti = referencia.multiplicar(alto,ancho);
        System.out.println(resMulti);
    }
    public float multiplicar(float alto, float ancho){
        float resultado = alto * ancho;
        return resultado;
    }
}
