package unidad4.Clone.Boletin.Models;

public class Motor implements Cloneable {
    private Combustible tipo;
    private int cv;
    private Boolean enMarcha;

    public Motor(Combustible tipo, int cv, Boolean enMarcha) {
        this.tipo = tipo;
        this.cv = cv;
        this.enMarcha = enMarcha;
    }

    public Combustible getTipo() {
        return tipo;
    }

    public void setTipo(Combustible tipo) {
        this.tipo = tipo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public Boolean getEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(Boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo=" + tipo +
                ", cv=" + cv +
                ", enMarcha=" + enMarcha +
                '}';
    }
}
