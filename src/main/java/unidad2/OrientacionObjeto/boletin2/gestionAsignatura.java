package unidad2.OrientacionObjeto.boletin2;


public class gestionAsignatura {
    static void main() {
        NotaAsignatura matematicas = new NotaAsignatura();
        matematicas.nombre = "Matematicas";
        matematicas.notaPrimerTimestre = 8;
        matematicas.notaSegundoTimestre = 9;
        matematicas.notaTerceroTimestre = 10;

        matematicas.TrimestreAprobados();
        System.out.println(matematicas.toString());
        matematicas.NotaMedia();

        NotaAsignatura lengua = new NotaAsignatura();
        lengua.nombre = "Lengua";
        lengua.notaPrimerTimestre = 6;
        lengua.notaSegundoTimestre = 5;
        lengua.notaTerceroTimestre = 6;

        lengua.TrimestreAprobados();
        System.out.println(lengua.toString());
        lengua.NotaMedia();

    }
}
