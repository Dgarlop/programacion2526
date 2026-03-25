package unidad4.Mapas.EjemplosClase;

import java.util.*;

public class Clase1 {
    static void main(String[] args) {
        Map<ClaseAlumno, Double> map = new HashMap<ClaseAlumno, Double>();
        ClaseAlumno cA = new ClaseAlumno("Diego", 1, "1234578D");
        ClaseAlumno cA2 = new ClaseAlumno("Maria", 2, "1234577M");
        ClaseAlumno cA3 = new ClaseAlumno("Maria", 2, "1234577M");
        map.put(cA,1d);
        map.put(cA2,2d);
        map.put(cA3,3d);

        System.out.println(map.toString());
        System.out.println(map.size());
        Set<ClaseAlumno> claves = map.keySet();
        System.out.println(claves);
        Collection<Double> valores = map.values();
        System.out.println(valores);

        Map<ClaseAlumno, List<Double>> mapa2 = new LinkedHashMap<ClaseAlumno, List<Double>>();
        List<Double> list1 = new ArrayList<Double>();
        list1.add(1d);
        list1.add(2d);
        list1.add(3d);
        List<Double> list2 = new ArrayList<Double>();
        list2.add(4d);
        list2.add(5d);
        list2.add(6d);
        mapa2.put(cA,list1);
        mapa2.put(cA2,list2);

        System.out.println(mapa2.toString());
        List<Double> valoresPersona2 = mapa2.get(cA2);
        valoresPersona2.add(4d);
        System.out.println(mapa2.toString());
    }
}
