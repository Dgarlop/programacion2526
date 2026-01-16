package unidad2.boletin1_java;
import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
    static void main(String[] args) {
        ejercicio10 referecncia = new ejercicio10();
        Random random = new Random();
        int numero = random.nextInt(10);
        referecncia.validacion(numero);
    }
    public void validacion (int generado){
        int intentos = 0;
        Scanner respuesta = new Scanner(System.in);
        System.out.println("Adivina numero");
        int resp = respuesta.nextInt();
        while (generado != resp){
            System.out.println("Adivina numero");
            resp = respuesta.nextInt();
            intentos = intentos + 1;
        }
        System.out.println("El numero de intentos son: "+ intentos);
        System.out.println("El numero es: "+ generado);
    }
}
