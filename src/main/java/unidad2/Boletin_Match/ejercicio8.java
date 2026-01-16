package unidad2.Boletin_Match;

import java.util.Scanner;

public class ejercicio8 {
    //ejercicio12
    static void main(String[] args) {
        Scanner seguridad = new Scanner(System.in);
        System.out.println("Introduce la contraseña ");
        int password = seguridad.nextInt();
        while (password != 1234){
            System.out.println("Introduce la contraseña ");
            password = seguridad.nextInt();
        }
        System.out.println("Contraseña validada");
    }
}
