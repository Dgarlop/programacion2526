package unidad2.boletinEstaticos.boletin1;

import java.time.LocalDate;

public class Conversor{

    public static final double FACTOR = 0.95;

    static void dolar_A_euro(double dolar){
        double re = dolar * FACTOR;
        System.out.println("Tienes un total de " + re + " euros");
    }
    static void euro_A_dolar(double euro){
        double re = euro / FACTOR;
        System.out.println("Tienes un total de " + re + " dolares");
    }
}
