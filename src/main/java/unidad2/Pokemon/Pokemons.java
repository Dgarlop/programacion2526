package unidad2.Pokemon;

import java.util.Scanner;
import java.util.Random;

public class Pokemons {
    static void main(String[] args) {
        Pokemons refPokemon = new Pokemons();
        Scanner sc = new Scanner(System.in);
        String []listaPokemons = new String[15];
        int []nvPokemons = new int[15];
        int contadorPokemon = 0;
        int batallas = 0;

        int elecccion = 1;
        while(elecccion!=0){
            refPokemon.menu();
            elecccion = sc.nextInt();
            switch(elecccion){
                case 1:
                    refPokemon.capturarPokemon(listaPokemons, nvPokemons,  contadorPokemon);
                    contadorPokemon = contadorPokemon + 1;
                    break;
                case 2:
                    refPokemon.RealizarBattle(listaPokemons, nvPokemons,  contadorPokemon);
                    batallas = batallas + 1;
                    break;
                case 3:
                    refPokemon.pokedex(listaPokemons, nvPokemons, contadorPokemon);
                    break;

            }
        }
        /*for (int i = 0; i < contadorPokemon; i++) {
            int total_Nivel = i + i;
            int media = total_Nivel / contadorPokemon;
        }*/

        System.out.println("Tienes un total de " + contadorPokemon + " Pokemons");
        //System.out.println("Tienes una media de " + media + "de nivel");
        System.out.println("Has realizado un total de " + batallas + " batallas");
        System.out.println("Saliendo...");


    }
    public void menu(){
        System.out.println("Elige la opcion que desea: ");
        System.out.println("1. Capturar un Pokemon");
        System.out.println("2. Realizar una batalla");
        System.out.println("3. Mostrar Pokedex");
        System.out.println("0. Salir");
    }
    public void capturarPokemon(String [] listaPokemons, int [] nvPokemons,  int contadorPokemon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nombre del pokemon: ");
        String nombre = sc.nextLine();
        System.out.println("Indique el nivel del pokemon: ");
        int nivel = sc.nextInt();
        if (contadorPokemon<15){
            listaPokemons[contadorPokemon]=nombre;
            nvPokemons[contadorPokemon]=nivel;
        }

    }
    public void RealizarBattle(String [] listaPokemons, int [] nvPokemons, int contadorPokemon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el pokemon elegido: ");
        int pokemonelegido = sc.nextInt();
        Random enemy = new Random();
        int pokemonenemigo = enemy.nextInt(0,contadorPokemon);
        while (pokemonenemigo==pokemonelegido){
            pokemonenemigo = enemy.nextInt(0,contadorPokemon);
        }
        int pokemon = nvPokemons[pokemonelegido - 1];
        int enemigo = nvPokemons[pokemonenemigo];
        System.out.println(listaPokemons[pokemonelegido-1] + " - Nivel " + nvPokemons[pokemonelegido-1] + " VS " + listaPokemons[pokemonenemigo] + " - Nivel " + nvPokemons[pokemonenemigo]);
        if (pokemon>enemigo){
            System.out.println("HAS GANADO");

        } else if (pokemon<enemigo) {
            System.out.println("HAS PERDIDO");
        }
        else {
            System.out.println("EMPATE");
        }


    }
    public void pokedex(String [] listaPokemons, int [] nvPokemons, int contadorPokemon) {
        int espacio_libre = 15 - contadorPokemon;
        System.out.println("Espacio libre: " + espacio_libre);
        for (int i = 0; i < contadorPokemon; i++) {
            System.out.println((i+1)+" " + listaPokemons[i] + " - Nivel " + nvPokemons[i]);
        }

    }
}
