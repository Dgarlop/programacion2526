package unidad2.OrientacionObjeto.boletin2;

import java.util.Scanner;

public class cubo {
    double longitud_lado;
    double litroAlmacenado;

    public double calcularArea(){
        double area = (longitud_lado*longitud_lado) * 6;
        return area;
    }

    public double calcularVolumem(){
        double volumen = longitud_lado*longitud_lado*longitud_lado;
        return volumen;
    }

    public boolean rellenar(double litroTotal){
        Scanner sc = new Scanner(System.in);
        boolean rellena = false;
        System.out.println("Cuanto quieres rellenar");
        double cantidad_relleno = sc.nextDouble();
        double litroDisponible = litroTotal - litroAlmacenado;
        if(cantidad_relleno <= litroDisponible){
            rellena = true;
            System.out.println("Rellenando...");
        }
        else {
            rellena = false;
            System.out.println("Limite excedido...");
        }
        return rellena;
    }

    public boolean vaciar (double litroTotal){
        Scanner sc = new Scanner(System.in);
        boolean vacia = false;
        System.out.println("Cuanto quieres vaciar");
        double cantidad_vacio = sc.nextDouble();
        double litroDisponible = litroTotal - litroAlmacenado;
        if(cantidad_vacio <= litroDisponible){
            vacia = true;
            System.out.println("Vaciando...");
        }
        else {
            vacia = false;
            System.out.println("Limite excedido...");
        }
        return vacia;
    }

}
