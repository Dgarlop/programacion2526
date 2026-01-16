package unidad2.Boletin_Match;
import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;

public class ejercicio7 {
    //ejercicio11
    static void main(String[] args) {
        Random random = new Random();
        int maquina = random.nextInt(3);
        Scanner human = new Scanner(System.in);
        System.out.println("Dame un numero del 0-2: 0 = Piedra, 1 = Papel, 2 = Tijeras ");
        int humano = human.nextInt();
        System.out.println(maquina);
        while (humano != maquina){
            System.out.println("Dame un numero del 0-2: 0 = Piedra, 1 = Papel, 2 = Tijeras ");
            humano = human.nextInt();
            switch (humano){
                case 0:
                    if (maquina == 1) {
                        System.out.println("Gana la maquina");
                    }
                    else{
                        System.out.println("Gana el humano");
                    }
                    break;

                case 1:
                    if (maquina == 0){
                        System.out.println("Gana el humano");
                    }
                    else{
                        System.out.println("Gana la maquina");
                    }
                    break;
                case 2:
                    if (maquina == 0){
                        System.out.println("Gana la maquina");
                    }
                    else{
                        System.out.println("Gana el humano");
                    }
                    break;
            }
        }
        System.out.println("Empate");
    }
}
