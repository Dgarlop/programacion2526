package unidad2.boletinEstaticos.boletin1;

import java.time.LocalDate;

public class GestionaCuentas {
    static void main(String[] args) {
        Cliente c1 = new Cliente("Diego", "Garcia", "1234D");
        Cliente c2 = new Cliente("Maria", "Fernandez", "1234M");
        Cliente c3 = new Cliente("Sergio", "Galan", "1234S");

        CuentaBancaria cb1 = new CuentaBancaria(10000.00, LocalDate.now(),"12345678D",c1);
        CuentaBancaria cb2 = new CuentaBancaria(1000.00, LocalDate.of(2026,01,14),"12345678D",c2);
        CuentaBancaria cb3 = new CuentaBancaria(10000.00, LocalDate.of(2026,01,01),"12345678D",c1);
        //Autorizados
        cb1.setAutorizado(c2.getNombre());
        cb2.setAutorizado(c1.getNombre());
        //Resultado
        System.out.println(cb1);
        System.out.println(cb2);
        System.out.println(cb3);
    }
}
