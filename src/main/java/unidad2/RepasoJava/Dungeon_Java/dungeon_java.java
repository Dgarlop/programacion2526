package unidad2.RepasoJava.Dungeon_Java;
import java.util.Random;
import java.util.Scanner;

public class dungeon_java {
    static void main(String[] args) {
        //fase a configuracion e inicializacion

        int hp_heroe = 100;
        int hp_monstruo = 80;
        int mp = 20;
        Scanner nombre_heroe = new Scanner(System.in);
        System.out.println("Dime el nombre de tu heroe");
        String n_heroe = nombre_heroe.nextLine();
        System.out.println("Héroe: 100 puntos de vida (HP) y 20 puntos de energía (MP).");
        System.out.println("Monstruo: 80 puntos de vida (HP).");

        //fase b fase de combateebwg


        while (hp_heroe > 0 && hp_monstruo > 0){
            System.out.println("Vida del heroe" + hp_heroe);
            System.out.println("Vida del mounstruo" + hp_monstruo);
            System.out.println("Tu energia es" + mp);
            System.out.println("1. Ataque Básico: No consume energía. El daño será un valor aleatorio entre 7 y 12.\n" +
                    "2. Ataque Especial: Consume 5 puntos de energía. El daño será un valor aleatorio entre 15 y 25. (Solo si tiene energía suficiente).\n" +
                    "3. Curar: Consume 8 de energía y recupera 20 de vida.\n");
            Scanner ele = new Scanner(System.in);
            System.out.println("Que eliges");
            int eleccion = ele.nextInt();
            switch (eleccion){
                case 1:
                    Random basic = new Random();
                    int daño_basico = basic.nextInt(7,12);
                    System.out.println(daño_basico);
                    hp_monstruo = hp_monstruo - daño_basico;
                    break;
                case 2:
                    if (mp >= 5){
                        Random especial = new Random();
                        int daño_especial = especial.nextInt(15,25);
                        System.out.println(daño_especial);
                        mp = mp - 5;
                        hp_monstruo = hp_monstruo - 15;
                    }
                    else {
                        System.out.println("No tienes energia para poder realizar el ataque");
                    }
                    break;
                case 3:
                    if (mp >= 8){
                        mp = mp - 8;
                        hp_heroe = hp_heroe + 20;
                    }
                    else {
                    System.out.println("No tienes energia para poder realizar el ataque");
                }
                    break;
            }
            if (hp_monstruo > 0){
                Random contraataque = new Random();
                int daño_contraataque = contraataque.nextInt(5,15);
                System.out.println(daño_contraataque);
                hp_heroe = hp_heroe - daño_contraataque;
            }
        }
        if (hp_heroe > 0){
            System.out.println("Has ganado");
        }
        else {
            System.out.println("Has perdido");
        }
    }
}
