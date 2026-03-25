package unidad4.Clone.EjemplosClase;

public class GestionaPersonas {
    static void main(String[] args) {
        Direccion d1 = new Direccion("C/ Cordoba", 33);
        Persona p1 = new Persona("Maria","12345678M",d1);
        Object p2 = null;
        try{
            p2 = p1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Persona p3 = (Persona)p2;
        p3.getDireccion().setCalle("C/ Sevilla");
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p1 == p3);
    }
}
