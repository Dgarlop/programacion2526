package unidad2.boletin1_java;

import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Usuario: ");
        String user = nombre.next();

        Scanner pass = new Scanner(System.in);
        System.out.println("Contraseña: ");
        String password = pass.next();

        while (user != "admin" && password != "secreta123"){
        }
    }
}
