package unidad4.Colecciones.Boletin5.ejercicio2.models;

import unidad2.boletinOrdenaciones.Ejercicio2.exceptions.HistorialException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historial {
    private ArrayList<PaginaWeb> lista;

    public Historial() {
        lista = new ArrayList<>();
    }

    public void agregarPagina(String url, LocalDate fecha) throws HistorialException {
        if (fecha.isAfter(LocalDate.now())) {
            throw new HistorialException("La fecha no puede ser futura");
        }
        PaginaWeb pagina = new PaginaWeb(url, fecha);
        lista.add(pagina);
    }

    public void agregarPagina(String url) throws HistorialException {
        LocalDate fechaActual = LocalDate.now();
        agregarPagina(url, fechaActual);
    }

    public ArrayList<PaginaWeb> consultarTodo() {

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                LocalDate fecha1 = lista.get(j).getFecha();
                LocalDate fecha2 = lista.get(j + 1).getFecha();
                if (fecha1.isAfter(fecha2)) {
                    PaginaWeb aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }
        ArrayList<PaginaWeb> resultado = lista;
        return resultado;
    }

    public ArrayList<PaginaWeb> consultarPorDia(LocalDate fecha) {
        ArrayList<PaginaWeb> resultado = new ArrayList<>();
        for (PaginaWeb p : lista) {
            if (p.getFecha().equals(fecha)) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    public ArrayList<PaginaWeb> consultarPorUrl(String url) {
        ArrayList<PaginaWeb> resultado = new ArrayList<>();
        for (PaginaWeb p : lista) {
            if (p.getUrl().equalsIgnoreCase(url)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public boolean borrarPorUrl(String url) {
        boolean borrado = false;

        ArrayList<PaginaWeb> nuevaLista = new ArrayList<>();
        for (PaginaWeb p : lista) {
            if (!p.getUrl().equalsIgnoreCase(url)) {
                nuevaLista.add(p);
            } else {
                borrado = true;
            }
        }
        lista = nuevaLista;
        return borrado;
    }
}
