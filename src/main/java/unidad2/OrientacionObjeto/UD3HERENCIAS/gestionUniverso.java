package unidad2.OrientacionObjeto.UD3HERENCIAS;

public class gestionUniverso {
    static void main(String[] args) {
        astro as1 = new astro( "astro1", 15.00,  25.00,  4.00,  5.00,  500.00);
        Planeta pl1 = new Planeta("Tierra",  50.00,  250.00,  10.0, 8.0, 210.0, 500.0);
        satelite st1 = new satelite("Luna",  pl1,  54.00,  40.0,  100.0);

        as1.muestra();
        pl1.muestra();
        st1.muestra();

    }
}
