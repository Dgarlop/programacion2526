/*package unidad4.Colecciones.BoletinListas.Ejericio2.Controller;

import unidad4.Colecciones.BoletinListas.Ejericio2.Model.Biblioteca;
import unidad4.Colecciones.BoletinListas.Ejericio2.Exceptions.BibliotecaException;
import unidad4.Colecciones.BoletinListas.Ejericio2.Model.Estado;
import unidad4.Colecciones.BoletinListas.Ejericio2.Model.Libro;

import java.util.LinkedList;
import java.util.Scanner;

public class GestionaBiblioteca {
    static void main(String[] args) {

        Biblioteca b = new Biblioteca();
        GestionaBiblioteca g = new GestionaBiblioteca();
        Libro libro1 = new Libro("titulo", "autor", "genero", 2025, Estado.PRESTADO);
        Libro libro2 = new Libro("tete", "autor", "genero", 2025, Estado.PRESTADO);

        libro1.add(libro2);

        int opcion = g.menu();
        while(opcion != 7){
            switch(opcion){
                case 1:
                    b.agregarLibro(librerira);
                    System.out.println("-------------*-----------");
                    break;
                case 2:
                    try {
                        b.prestar();
                    }catch (BibliotecaException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("-------------*-----------");
                    break;
                case 3:
                    try {
                        b.devolverLibro(librerira);
                    }catch (BibliotecaException e){
                        System.out.println(e.getMessage());
                    }

                    System.out.println("-------------*-----------");
                    break;
                case 4:
                    b.listaLibros(librerira);
                    System.out.println("-------------*-----------");
                    break;
                case 5:
                    b.listaLibrosDetallada(librerira);
                    System.out.println("-------------*-----------");
                    break;
                case 6:
                    b.buscarLibro(librerira);
                    System.out.println("-------------*-----------");
                    break;

            }
            opcion = g.menu();
        }
        System.out.println("Saliendo......");
        System.out.println("Biblioteca finalizado");
    }
    int menu() {
        Scanner numero = new Scanner(System.in);
        System.out.println("Incinado......");
        System.out.println("Bienvenido a la Biblioteca");
        System.out.println("Pulse 1. Agregar libro");
        System.out.println("Pulse 2. Prestar libro");
        System.out.println("Pulse 3. Devolver libro");
        System.out.println("Pulse 4. Mostrar libros");
        System.out.println("Pulse 5. Mostrar libros con informacion detallada");
        System.out.println("Pulse 6. Buscar libro");
        System.out.println("Pulse 7. Salir");
        int opcion = numero.nextInt();
        return opcion;
    }
}*/
