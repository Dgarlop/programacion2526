package unidad2.Boletin_Match;

import java.util.Scanner;

public class ejercicio1 {
    static void main(){
        Scanner numero = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = numero.nextInt();

        switch (num){
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            default:
                System.out.println("OTRAS");
                break;
        }
    }
}
