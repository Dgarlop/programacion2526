package unidad2.boletinInterfaz1;

public abstract class Animal {
    private String nombre;
    private String lugarHabita;
    private Animal[] animalesCome;
    private Animal[] esComido;

    public Animal() {
    }

    public Animal(String nombre, String lugarHabita) {
        this.nombre = nombre;
        this.lugarHabita = lugarHabita;
        this.animalesCome = new Animal[10];
        this.esComido = new Animal[10];
    }

    abstract boolean atacar();
    abstract boolean huir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarHabita() {
        return lugarHabita;
    }

    public void setLugarHabita(String lugarHabita) {
        this.lugarHabita = lugarHabita;
    }

    public Animal[] getAnimalesCome() {
        return animalesCome;
    }

    public void setAnimalesCome(Animal[] animalesCome) {
        this.animalesCome = animalesCome;
    }

    public Animal[] getEsComido() {
        return esComido;
    }

    public void setEsComido(Animal[] esComido) {
        this.esComido = esComido;
    }
}
