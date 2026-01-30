package unidad2.OrientacionObjeto.boletin2;

public class gestionaLibro {
    static void main() {
        libro libro1 = new libro();
        libro1.titulo = "Don quijote";
        libro1.autor = "Quijote";
        libro1.numPaginas = 300;
        libro1.isbn= 3458;

        libro libro2 = new libro();
        libro2.titulo = "Batman";
        libro2.autor = "DC";
        libro2.numPaginas = 100;
        libro2.isbn= 2258;

        libro libro3 = new libro();
        libro3.titulo = "Spider-Man";
        libro3.autor = "Marvel";
        libro3.numPaginas = 100;
        libro3.isbn= 8558;

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
