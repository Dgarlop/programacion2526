package unidad4.Clone.EjemplosClase;

public class Direccion {
    private String Calle;
    private int numero;

    public Direccion(String calle, int numero) {
        Calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
