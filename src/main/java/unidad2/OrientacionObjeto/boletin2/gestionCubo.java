package unidad2.OrientacionObjeto.boletin2;

public class gestionCubo {
    static void main() {
        cubo cubo1 = new cubo();
        cubo1.longitud_lado = 5;
        cubo1.litroAlmacenado = 42;

        System.out.println(cubo1.calcularArea());
        double litroTotal = cubo1.calcularVolumem();
        System.out.println(litroTotal);
        cubo1.rellenar(litroTotal);
        cubo1.vaciar(litroTotal);
    }


}
