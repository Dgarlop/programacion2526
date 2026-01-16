package unidad2.Reto;

import unidad2.boletin1_java.ejercicio5;

import java.util.Scanner;

public class Reto_luces {
    static void main(String[] args) {
        Reto_luces referencia = new Reto_luces();

        boolean devolucion = referencia.hayDevolucion();
        System.out.println(devolucion);
    }
    public boolean hayDevolucion(){
        boolean hay = false;
        Scanner resp = new Scanner(System.in);
        int Fundidas = 0;
        for (int i = 0; i < 10; i ++ ) {
            System.out.println("Responde S o N: ");
            String respuesta = resp.next();

            while (!(respuesta.equals("S") || respuesta.equals("N"))){
                Scanner resp2 = new Scanner(System.in);
                System.out.println("Quillo ayudame S o N: ");
                respuesta = resp2.next();
            }
            if (respuesta.equals( "S")){
                Fundidas = Fundidas + 1 ;
            }
        }
        if (Fundidas >= 5)
            hay = true;
        return hay;
    }
}
