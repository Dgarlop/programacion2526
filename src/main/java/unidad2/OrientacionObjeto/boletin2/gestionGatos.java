package unidad2.OrientacionObjeto.boletin2;

public class gestionGatos {
    static void main() {
        gato gato1 = new gato();
        gato1.color = "naranja";
        gato1.edad = 5;
        gato1.peso = 15;
        gato1.sexo = "hembra";
        gato1.raza = "abisino";

        gato gato2 = new gato();
        gato2.color = "blanco";
        gato2.edad = 4;
        gato2.peso = 10;
        gato2.sexo = "hembra";
        gato2.raza = "american wirehair";

        gato gato3 = new gato();
        gato3.color = "negro";
        gato3.edad = 5;
        gato3.peso = 10;
        gato3.sexo = "macho";
        gato3.raza = "bombay";


        gato1.maulla();
        gato1.comida("pienso");
        gato2.ronronea();
        gato2.comida("pescado");
        gato1.pelea(gato2);
        gato1.pelea(gato3);

    }
}
