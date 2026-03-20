package unidad4.Colecciones.Boletin5.ejercicio1.controller;
import unidad4.Colecciones.Boletin5.ejercicio1.models.Animal;
import unidad4.Colecciones.Boletin5.ejercicio1.models.RepositorioAnimal;
import unidad4.Colecciones.Boletin5.ejercicio1.models.Medio;
import unidad4.Colecciones.Boletin5.ejercicio1.models.Comida;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestionaReservas {
    public static void main(String[] args) {
        RepositorioAnimal repo = new RepositorioAnimal("Zoo Central", "Madrid", 50000);

        Animal a1 = new Animal("001", "Leon", LocalDate.of(2020, 5, 10), Medio.TIERRA, Comida.CARNIVORO);
        Animal a2 = new Animal("002", "Aguila", LocalDate.of(2018, 3, 15), Medio.AIRE, Comida.CARNIVORO);
        Animal a3 = new Animal("003", "Leon", LocalDate.of(2019, 1, 1), Medio.TIERRA, Comida.CARNIVORO);
        Animal a4 = new Animal("004", "Delfin", LocalDate.of(2021, 8, 20), Medio.AGUA, Comida.CARNIVORO);

        repo.añadirAnimal(a1);
        repo.añadirAnimal(a2);
        repo.añadirAnimal(a3);
        repo.añadirAnimal(a4);

        a1.setPeso(190.5);

        System.out.println("Lista Original (Orden Nombre/ID)");
        repo.mostrarAnimales();

        System.out.println("Orden: Nombre y Fecha Nacimiento");
        List<Animal> listaPorFecha = new ArrayList<>(repo.getListaAnimales());
        listaPorFecha.sort(Comparator.comparing(Animal::getNombre)
                .thenComparing(Animal::getFechaNacimiento));
        listaPorFecha.forEach(System.out::println);

        System.out.println("Orden: Medio y Nombre (Sin modificar almacenamiento)");
        List<Animal> listaPorMedio = new ArrayList<>(repo.getListaAnimales());
        listaPorMedio.sort(Comparator.comparing(Animal::getMedio)
                .thenComparing(Animal::getNombre));
        listaPorMedio.forEach(System.out::println);
    }
}
