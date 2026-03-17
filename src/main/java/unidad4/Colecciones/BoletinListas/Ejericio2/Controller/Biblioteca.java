package unidad4.Colecciones.BoletinListas.Ejericio2.Controller;

import unidad4.Colecciones.BoletinListas.Ejericio2.Model.Estado;
import unidad4.Colecciones.BoletinListas.Ejericio2.Model.Libro;

import java.time.LocalDate;
import java.util.Scanner;

public class Biblioteca {
    static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        int opcion = b.menu();
        while(opcion != 7){
            switch(opcion){
                case 1:
                    b.agregarLibro();
                    break;
                case 2:
                    System.out.println("Prestar");
                case 3:
                    System.out.println("Devolver");
                case 4:
                    System.out.println("Mostrar tabla");
                case 5:
                    System.out.println("Mostrar tabla detallada");
                case 6:
                    System.out.println("Buscar por tutor o titulo");

            }
            opcion = b.menu();
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
    void agregarLibro() {
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Ingrese el genero del libro");
        String genero = sc.nextLine();
        System.out.println("Ingrese el año del libro");
        int anno = sc.nextInt();

        String libro = "libro" + contador;
        Libro libro1 = new Libro(titulo, autor, genero, anno, Estado.LIBRE);
        if (libro1.getEstado().equals(Estado.LIBRE))
    }
    void prestarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el libro que desea elegir");
        String libroElegido = sc.nextLine();
        if (libroElegido.getEstado().equals(Estado.PRESTADO)){
            System.out.println("Este libro ya esta prestado eliga otro");
        }
        else {
            libroElegido.setEstado(Estado.PRESTADO);
            System.out.println("Libro prestado");
        }

    }
}
