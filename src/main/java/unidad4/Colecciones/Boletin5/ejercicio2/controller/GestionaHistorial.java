package unidad4.Colecciones.Boletin5.ejercicio2.controller;

import unidad2.boletinOrdenaciones.Ejercicio2.exceptions.HistorialException;
import unidad2.boletinOrdenaciones.Ejercicio2.models.Historial;
import unidad2.boletinOrdenaciones.Ejercicio2.models.PaginaWeb;

import java.time.LocalDate;

public class GestionaHistorial {
    static void main(String[] args) {
        Historial historial = new Historial();

        try {
            historial.agregarPagina("google.com", LocalDate.of(2023, 5, 10));
            historial.agregarPagina("youtube.com", LocalDate.of(2022, 1, 1));
            historial.agregarPagina("google.com", LocalDate.of(2050, 1, 1));
        } catch (HistorialException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            historial.agregarPagina("google.com");
            historial.agregarPagina("youtube.com");
            historial.agregarPagina("google.com", LocalDate.of(2020, 12, 31));
        } catch (HistorialException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Historial ordenado");
        for (PaginaWeb p : historial.consultarTodo()) {
            System.out.println(p);
        }

        System.out.println("Registros para google.com");
        for (PaginaWeb p : historial.consultarPorUrl("google.com")) {
            System.out.println(p);
        }
    }
}
