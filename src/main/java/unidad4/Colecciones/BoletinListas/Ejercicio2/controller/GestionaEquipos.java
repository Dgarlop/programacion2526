package unidad4.Colecciones.BoletinListas.Ejercicio2.controller;

import unidad4.Colecciones.BoletinListas.Ejercicio2.models.Alumno;
import unidad4.Colecciones.BoletinListas.Ejercicio2.models.Equipo;

import java.util.ArrayList;

public class GestionaEquipos {
    static void main(String[] args) {
        Alumno a1 = new Alumno("Diego" , "123");
        Alumno a2 = new Alumno("Maria", "1234");
        Alumno a3 = new Alumno("Manuel", "12345");
        Alumno a4 = new Alumno("Pili" , "12");
        Alumno a5 = new Alumno("Polo" , "123");

        Equipo e1 = new Equipo("Sevilla");
        Equipo e2 = new Equipo("Madrid");
        System.out.println("--------A Ñ A D I R-----------");
        e1.add(a1);
        e1.add(a4);
        e1.add(a3);
        e2.add(a2);
        System.out.println("--------B O R R A R-----------");
        e1.remove(a3);
        System.out.println("--------B U S C A R-----------");
        System.out.println(e1.buscar(a4));
        System.out.println("--------T O S T R I N G-----------");
        System.out.println(e1.toString());
        System.out.println("--------M O S T R A R-----------");
        e1.mostrar();
        System.out.println("--------U N I O N-----------");
        e1.union(e2);

    }
}
