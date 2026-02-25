package unidad2.boletinInterfaz1;

public class Leon extends Animal {

    public Leon() {
    }

    public Leon(String nombre, String lugarHabita) {
        super(nombre, lugarHabita);
        this.getAnimalesCome()[0] = new Roedor();
        this.getAnimalesCome()[1] = new Serpiente();
        this.getAnimalesCome()[2] = new Rapaz();
    }

    @Override
    boolean atacar() {
        return false;
    }

    @Override
    boolean huir() {
        return false;
    }
}
