package unidad2.boletinInterfaz1;

public class Rapaz extends Animal {

    public Rapaz() {
    }

    public Rapaz(String nombre, String lugarHabita) {
        super(nombre, lugarHabita);
        this.getAnimalesCome()[0] = new Serpiente();
        this.getAnimalesCome()[1] = new Roedor();
        this.getEsComido()[0] = new Leon();
    }


    @Override
    boolean atacar() {
        return false;
    }

    @Override
    boolean huir() {
        // puede huir de leon
        return false;
    }
}
