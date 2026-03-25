package unidad4.Mapas.BoletinMapas.Ejercicio1.Models;

import java.util.Map;

public class RegsitroEntrada {
    private Map<Influencer, EntradaVip> entradas;

    public void agregarEntrada(EntradaVip entradaVip, Influencer influencer) {
        entradas.put(influencer, entradaVip);
    }
    public EntradaVip buscar(Influencer influencer) {
        EntradaVip entradaEncontrada = entradas.get(influencer);
        if (entradaEncontrada == null) {
            System.out.println("Entrada no encontrada");
        }
        return entradaEncontrada;
    }

    public void confirmarEntrada(EntradaVip entradaVip, Influencer influencer) {
        EntradaVip entradaEncontrada = buscar(influencer);
        if(!(entradaEncontrada == null)){
            entradas.put(influencer, entradaVip.setEstado(Estado.CONFIRMADA));
        }
        else{
            System.out.println("Entrada no encontrada");
        }
    }
    public void cancelarEntrada(EntradaVip entradaVip, Influencer influencer) {
        EntradaVip entradaEncontrada = buscar(influencer);
        if(!(entradaEncontrada == null)){
            entradas.put(influencer, entradaVip.setEstado(Estado.CANCELADA));
        }
        else{
            System.out.println("Entrada no encontrada");
        }
    }
}
