package unidad4.Colecciones.BoletinListas.controller;

import unidad4.Colecciones.BoletinListas.model.Estudiante;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GestionaEstudiantes {
    static void main(String[] args) {
        Estudiante e1 = new Estudiante("Diego", 1);
        Estudiante e2 = new Estudiante("Maria Isabel", 2);
        Estudiante e3 = new Estudiante("Diego", 3);
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        GestionaEstudiantes g = new GestionaEstudiantes();
        g.agregarEstudiante(e1, listaEstudiantes);
        g.agregarEstudiante(e2, listaEstudiantes);
        g.agregarEstudiante(e3, listaEstudiantes);

        for(Estudiante e : listaEstudiantes) {
            System.out.println(e);
        }
    }

    private boolean agregarEstudiante(Estudiante e, List<Estudiante> lista){
        boolean agregado = false;

        if(!lista.contains(e)){
            lista.add(e);
            agregado = true;
        }

        return agregado;
    }
}
