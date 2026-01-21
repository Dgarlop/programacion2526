package unidad2.BoletinMatriz;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        boolean [][] sala = new boolean[3][4];
        ejercicio2 ref = new ejercicio2();
        int numEspectadores = ref.registrarEspectadores(sala);
        System.out.println("Espectadores: " + numEspectadores);
        ref.contarFilas(sala);
    }
    public int registrarEspectadores(boolean [][] sala){
        Scanner pedir = new Scanner(System.in);
        System.out.println("Elija la fila");
        int filas = pedir.nextInt();
        System.out.println("Elija la butaca");
        int butaca = pedir.nextInt();

        int espectadores = 0;
        while(filas >= 0 && filas < 3 && butaca >= 0 && butaca < 4){
            if(sala[filas][butaca]){
                System.out.println("Asiento cogido elija otro");

            }
            else{
                sala[filas][butaca] = true;
                System.out.println("Se han sentado en la fila: " + filas + " y en la butaca: " + butaca);
                espectadores++;
            }
            System.out.println("Elija la fila");
            filas = pedir.nextInt();
            System.out.println("Elija la butaca");
            butaca = pedir.nextInt();


        }
        return espectadores;
    }
    public void contarFilas(boolean [][] sala){
        int contador = 0;
        for(int i = 0; i < sala.length; i++){
            if(sala[i][0]){
                contador = 0;
                for(int j = 0; j < sala[i].length; j++){
                    contador++;
                }
                System.out.println("En la fila " + i + " hay: " + contador + " espectadores" );
            }

        }
    }
}
