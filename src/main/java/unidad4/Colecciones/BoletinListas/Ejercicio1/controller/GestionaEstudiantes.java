package unidad4.Colecciones.BoletinListas.Ejercicio1.controller;

import unidad4.Colecciones.BoletinListas.Ejercicio1.model.Estudiante;
import unidad4.Colecciones.BoletinListas.Ejercicio1.model.Grupo;

import java.util.ArrayList;
import java.util.List;

public class GestionaEstudiantes {
    static void main(String[] args) {
        Estudiante e1 = new Estudiante("Diego", 1,new ArrayList<>());
        Estudiante e2 = new Estudiante("Maria Isabel", 2);
        Estudiante e3 = new Estudiante("Diego", 3);
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        GestionaEstudiantes g = new GestionaEstudiantes();
        g.agregarEstudiante(e1, listaEstudiantes);
        g.agregarEstudiante(e2, listaEstudiantes);
        g.agregarEstudiante(e3, listaEstudiantes);

        Grupo g1 = new Grupo(1, "Es el grupo1", listaEstudiantes, "Aula1");
        System.out.println(g1.toString());

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
