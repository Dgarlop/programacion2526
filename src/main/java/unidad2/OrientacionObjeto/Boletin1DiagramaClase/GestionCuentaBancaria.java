package unidad2.OrientacionObjeto.Boletin1DiagramaClase;

public class GestionCuentaBancaria {
    static void main(String[] args) {
        Persona p1 = new Persona( "123456A", "Elver",  "Galarga",  20);
        CuentaBancaria cuenta1 = new CuentaBancaria( "123456789AB", 200.0, "Elver", p1 );
        cuenta1.IngresarDinero();
        cuenta1.RetirarDinero();
        System.out.println(cuenta1.getSaldo());
        System.out.println("autorizado:  " + cuenta1.getAutorizado());
        cuenta1.ValidarAutorizado();
        cuenta1.EleminarAutorizado();

    }


}
