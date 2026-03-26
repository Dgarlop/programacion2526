package unidad4.Mapas.BoletinMapas.Ejercicio1.Models;

import java.util.*;

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
            EntradaVip entradaEncontrada = iterator.next();
            if (entradaEncontrada.getEstado().equals(Estado.CONFIRMADA)) {
                System.out.println(entradaEncontrada.toString());
            }
            else {

            }
        }
    }
    public void listaCancelados(){
        Iterator<EntradaVip> iterator = entradas.values().iterator();

        while(iterator.hasNext()){
            EntradaVip entradaEncontrada = iterator.next();
            if (entradaEncontrada.getEstado().equals(Estado.CANCELADA)) {
                System.out.println(entradaEncontrada.toString());
            }
            else {

            }
        }
    }

    public void numSeguidores(){
        Iterator<Influencer> iterator = entradas.keySet().iterator();
        TreeSet<Influencer> topInfluencers = new TreeSet<Influencer>();
        int seguidores = 0;
        while(iterator.hasNext()){
            Influencer in = iterator.next();
            if (in.getNumSeguidores() > seguidores) {
                seguidores = in.getNumSeguidores();
            }
            if (in.getNumSeguidores() == seguidores) {
                System.out.println(in.toString());

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
