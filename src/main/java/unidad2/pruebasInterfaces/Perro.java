package unidad2.pruebasInterfaces;

public class Perro extends Animal implements Canino, Omnivoro{
    @Override
    public String getRaza() {
        return "";
    }

    @Override
    public boolean estaVivo() {
        return false;
    }

    @Override
    public boolean seDesplaza() {
        return false;
    }
}
