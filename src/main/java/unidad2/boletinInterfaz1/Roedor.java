package unidad2.boletinInterfaz1;

public class Roedor extends Animal{

    public Roedor() {
    }

    public Roedor(String nombre, String lugarHabita) {
        super(nombre, lugarHabita);
        this.getEsComido()[0] = new Serpiente();
    }

    @Override
    boolean atacar() {
        return false;
    }

    @Override
    boolean huir() {

        //puede huir de serpiente no de rapaz ni de leon
        return false;
    }
}
