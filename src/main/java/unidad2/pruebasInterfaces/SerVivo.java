package unidad2.pruebasInterfaces;

public abstract class SerVivo {
    private int edad;

    protected SerVivo() {
    }

    public abstract boolean estaVivo();
    public abstract boolean seDesplaza();

    public SerVivo(int edad) {
        this.edad = edad;
    }
}
