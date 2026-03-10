package unidad3.exepciones.boletinE3.ejercicio1;

import unidad3.exepciones.boletinE2.excepcionespropias.MiExepcion;

import java.util.Scanner;

public class TraductorMorse {
    void metodo1(){
        throw new MiExepcion("Ejecucion de la exepcion");
    }

    boolean traducir (){
        boolean invalido = false;
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String validaLetras="[a-z]+";
        System.out.println(texto+" "+texto.matches(validaLetras));
        if (texto.matches(validaLetras)){
            invalido = false;
        }
        else {
            invalido = true;
        }
        return invalido;
    }
    static void main(String[] args) {
        TraductorMorse morse = new TraductorMorse();
        if (morse.traducir()){
            try{
                morse.metodo1();
            }catch(MiExepcion e){
                System.out.println(e.toString());
            }
        }else{
            System.out.println("Texto correcto");
        }



    }
}
