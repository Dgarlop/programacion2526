package unidad4.Colecciones.BoletinListas.Ejericio2.Model;

import unidad4.Colecciones.BoletinListas.Ejericio2.Exceptions.BibliotecaException;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    LinkedList<Libro> librerira;
    RepositorioPrestamos r;

    public Biblioteca() {
        this.librerira = new LinkedList<Libro>();
        this.r = new RepositorioPrestamos();
    }

    public void agregarLibro(LinkedList <Libro> librerira) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Ingrese el genero del libro");
        String genero = sc.nextLine();
        System.out.println("Ingrese el año del libro");
        int anno = sc.nextInt();
        Libro libroNuevo = new Libro(titulo, autor, genero, anno, Estado.LIBRE);
        librerira.add(libroNuevo);
    }
    public void prestar(Prestamo prestamo) {
        Boolean pre = false;
        r.addPrestamo(prestamo);
        prestarLibro(librerira);
    }
    private void prestarLibro(LinkedList <Libro> librerira) throws BibliotecaException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el libro que desea elegir");
        String libroElegido = sc.nextLine();
        Libro lib = null;
        Iterator<Libro> it = librerira.iterator();
        boolean encontrado = false;
        try {

            while(it.hasNext() && !encontrado){
                Libro libro = it.next();
                if (libro.getTitulo().equals(libroElegido)){
                    encontrado = true;
                    if (libro.getEstado() == Estado.LIBRE){
                        libro.setEstado(Estado.PRESTADO);
                        System.out.println(libro.toString());
                        lib = libro;
                    }
                    else{
                        throw new BibliotecaException("El libro ya esta prestado");
                    }
                }

            }
            if(lib == null){
                throw new BibliotecaException("El libro no existe");
            }


        }catch (BibliotecaException e){
            throw new BibliotecaException(e.getMessage());
        }
    }
    public void devolverLibro(LinkedList <Libro> librerira) throws BibliotecaException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el libro que desea elegir");
        String libroElegido = sc.nextLine();
        Libro lib = null;
        Iterator<Libro> it = librerira.iterator();
        boolean encontrado = false;
        try {

            while(it.hasNext() && !encontrado){
                Libro libro = it.next();
                if (libro.getTitulo().equals(libroElegido)){
                    encontrado = true;
                    if (libro.getEstado() == Estado.PRESTADO){
                        libro.setEstado(Estado.LIBRE);
                        System.out.println(libro.toString());
                        lib = libro;
                    }
                    else{
                        throw new BibliotecaException("El libro no esta prestado");
                    }
                }

            }
            if(lib == null){
                throw new BibliotecaException("El libro no existe");
            }


        }catch (BibliotecaException e){
            throw new BibliotecaException(e.getMessage());
        }
    }
    public void listaLibros(LinkedList <Libro> librerira) {
        for (Libro lib : librerira){
            System.out.println(lib.getTitulo());
        }
    }
    public void listaLibrosDetallada(LinkedList <Libro> librerira) {
        for (Libro lib : librerira){
            System.out.println(lib.toString());
        }
    }
    public void buscarLibro(LinkedList <Libro> librerira) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo o el autor");
        String buscarLibro = sc.nextLine();
        for (Libro lib : librerira){
            if (lib.getTitulo().equals(buscarLibro) || lib.getAutor().equals(buscarLibro)){
                System.out.println(lib.toString());
            }
            else{
                System.out.println("Libro no encontrado");
            }
        }
    }
}