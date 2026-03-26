package unidad4.Mapas.BoletinMapas.Ejercicio1.Models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RegsitroEntrada {
    private Map<Influencer, EntradaVip> entradas = new HashMap<Influencer, EntradaVip>();

    public void agregarEntrada(EntradaVip entradaVip, Influencer influencer) {

        entradas.put(influencer, entradaVip);
    }

    public EntradaVip buscar(Influencer influencer) {
        EntradaVip entradaEncontrada = entradas.get(influencer);
        if (entradaEncontrada == null) {
            System.out.println("Entrada no encontrada");
        }
        else {
            System.out.println("Entrada encontrada: " + entradas.toString());
        }
        return entradaEncontrada;
    }

    public void confirmarEntrada(EntradaVip entradaVip, Influencer influencer) {
        EntradaVip entradaEncontrada = buscar(influencer);
        if(!(entradaEncontrada == null)){
            entradaEncontrada.setEstado(Estado.CONFIRMADA);
            System.out.println(entradaEncontrada.toString());
        }
        else{
            System.out.println("Entrada no encontrada");
        }
    }
    public void cancelarEntrada(EntradaVip entradaVip, Influencer influencer) {
        EntradaVip entradaEncontrada = buscar(influencer);
        if(!(entradaEncontrada == null)){
            entradaEncontrada.setEstado(Estado.CANCELADA);
            System.out.println(entradaEncontrada.toString());
        }
        else{
            System.out.println("Entrada no encontrada");
        }
    }
    public void listaConfirmados(){
        Iterator<EntradaVip> iterator = entradas.values().iterator();

        while(iterator.hasNext()){
            if (iterator.next().getEstado().equals(Estado.CONFIRMADA)){
                EntradaVip eConfirmada = entradas.get();
                System.out.println(eConfirmada.toString());
            }
            else {

            }
        }
    }
    public void listaCancelados(){
        Iterator<EntradaVip> iterator = entradas.values().iterator();
        while(iterator.hasNext()){
            if (iterator.next().getEstado() == Estado.CANCELADA){
                System.out.println(entradas.toString());
            }
            else {

            }
        }
    }

    public Map<Influencer, EntradaVip> getEntradas() {
        return entradas;
    }

    public void setEntradas(Map<Influencer, EntradaVip> entradas) {
        this.entradas = entradas;
    }
}
