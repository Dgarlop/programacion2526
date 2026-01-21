package unidad2.RepasoJava.RacingJava;

import java.util.Scanner;

public class RacingJava {
    static void main(String[] args) {
        RacingJava referencia = new RacingJava();
        String[]nombresP = new String[10];
        double[]tiemposP = new double[10];
        referencia.ejecutarMenu(nombresP, tiemposP);
        int numpilotos = 0;
    }
    public void ejecutarMenu(String[]nombresP, double[]tiemposP){
        RacingJava ref = new RacingJava();
        System.out.println("1) Cargar/Reiniciar Datos:");
        System.out.println("2) Formatear Nombres:");
        System.out.println("3) Ver Estadísticas:");
        System.out.println("4) Buscar Piloto: ");
        System.out.println("5) Generar IDs de Carrera: ");
        System.out.println("6) Salir. ");
        Scanner opcion = new Scanner(System.in);
        System.out.print("Dime una opción: ");
        String opc = opcion.next();
        int numpilotos = 0;
        while(!opc.equals("6")){
            switch (opc){
                case "1":
                    ref.inicializaEscuderia(nombresP,tiemposP,numpilotos);
                    break;
                case "2":
                    ref.formatearPilotos(nombresP, numpilotos);
                    break;
            }
            System.out.println("1) Cargar/Reiniciar Datos:");
            System.out.println("2) Formatear Nombres:");
            System.out.println("3) Ver Estadísticas:");
            System.out.println("4) Buscar Piloto: ");
            System.out.println("5) Generar IDs de Carrera: ");
            System.out.println("6) Salir. ");
            System.out.print("Dime una opción: ");
            opc = opcion.next();
        }
    }
    public int inicializaEscuderia(String[]nombresP, double[]tiemposP, int numpilotos){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuántos pilotos quieres registrar: ");
        int numeropilotos = sc.nextInt();
        while (numpilotos < numeropilotos){
            numpilotos += 1;
            System.out.print("Dime nombre de piloto: ");
            String pilotos = sc.next();
            nombresP[numpilotos] = pilotos;
            System.out.print("Dime el tiempo de su mejor vuelta: ");
            double tiempo = sc.nextInt();
            while (tiempo < 0){
                System.out.print("Incorrecto, dime el tiempo de su mejor vuelta: ");
                double tiempos = sc.nextInt();
            }
            tiemposP[numpilotos] = tiempo;
        }
        return numpilotos;
    }
    public void formatearPilotos(String[]nombresP, int numpilotos){
        for(int i = 0; i < numpilotos; i++){
            nombresP[i] = nombresP[i].toUpperCase();
            nombresP[i] = nombresP[i].trim();
            if (nombresP[i].length()>=10){
                nombresP[i] = nombresP[i].substring(0,9);
            }
            System.out.println(nombresP[i] + ".");
        }
    }
    public void obtenerEstadisticas(String[]nombresP, double[]tiemposP, int numpilotos){
        int suma = 0;
        for (int i = 0; i < numpilotos; i++){
            suma += tiemposP[i];
            int media = suma / numpilotos;
        }
    }
}
