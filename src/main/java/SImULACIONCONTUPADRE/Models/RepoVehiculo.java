package SImULACIONCONTUPADRE.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepoVehiculo {
    Map<String, List<Vehiculo>> map;

    public RepoVehiculo() {
        this.map = new HashMap<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        if(!map.containsKey(vehiculo.getIdBastidor())){
            List<Vehiculo> lista = new ArrayList<>();
            lista.add(vehiculo);
            map.put(vehiculo.getIdBastidor(), lista);
        }
        else{
            System.out.println("Vehiculo existente con el mismo idbastidor");
        }
    }

    public void registrarRematriculacion(Vehiculo vehiculo){
        if(map.containsKey(vehiculo.getIdBastidor())){}
    }
}
