package unidad2.OrientacionObjeto;

public class GestionaPersonas {
    static void main(String[] args) {
        Persona maria = new Persona("Maria", 19, "Cordoba", "Avatar", "Volleyball");
        System.out.println(maria.toString());
        maria.hablar();
        maria.comer();

    }
}
