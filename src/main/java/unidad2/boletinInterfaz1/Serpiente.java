package unidad2.boletinInterfaz1;

public class Serpiente extends Animal {

    public Serpiente() {
    }

    public Serpiente(String nombre, String lugarHabita) {
        super(nombre, lugarHabita);
        this.getAnimalesCome()[0] = new Roedor();
        this.getEsComido()[1] = new Rapaz();
    }

    @Override
    boolean atacar() {
        return false;
    }

    @Override
    boolean huir() {
        System.out.println("No puede huir");
        return false;
    }
}
