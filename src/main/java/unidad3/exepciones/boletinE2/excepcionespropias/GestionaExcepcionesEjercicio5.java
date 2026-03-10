package unidad3.exepciones.boletinE2.excepcionespropias;

public class GestionaExcepcionesEjercicio5 {
    void metodo1(){

    throw new MiExepcion("Ejecucion de la exepcion");

    }
    static void main(String[] args) {
        GestionaExcepcionesEjercicio5 g = new GestionaExcepcionesEjercicio5();
        try{
            g.metodo1();
        }catch(MiExepcion e){
            System.out.println(e.toString());
        }

    }
}
