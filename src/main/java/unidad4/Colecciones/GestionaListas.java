package unidad4.Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GestionaListas {
    static void main(String[] args) {
        List<String> ciudades = new LinkedList<String>();
        ciudades.add("Madrid");
        ciudades.add("Cordoba");
        ciudades.add("Sevilla");
        ciudades.add("Barcelona");
        for(String elemento : ciudades){
            System.out.println(elemento);
        }
        System.out.println("--------");
        Iterator<String> itr = ciudades.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------*---------");
        List<String> ciudadesArray = new ArrayList<String>();
        ciudadesArray.add("Madrid");
        ciudadesArray.add("Cordoba");
        ciudadesArray.add("Sevilla");
        ciudadesArray.add("Barcelona");
        System.out.println(ciudadesArray.contains("Sevilla"));
        System.out.println(ciudadesArray.size());
    }
}
