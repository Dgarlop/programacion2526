package unidad3.exepciones.boletinE3.ejercicio1;

import unidad3.exepciones.boletinE2.excepcionespropias.MiExepcion;

import java.util.Scanner;

public class TraductorMorse {
    boolean traducir (String texto){
        boolean invalido = false;
        String validaLetras="^[\\p{L}\\s.,;:!?'\"\\-]+$";
        System.out.println(texto+" "+texto.matches(validaLetras));
        if (!texto.matches(validaLetras)){
            invalido = true;
            throw new MiExepcion("Cadena con caracteres especiales" + texto);
        }
        else {
            invalido = false;
        }
        return invalido;
    }
    static void main(String[] args) {
        TraductorMorse morse = new TraductorMorse();
        System.out.println("Dame un texto");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        while (!texto.equals(("fin"))) {
            boolean valido = false;
            try{
                valido = morse.traducir(texto);
            }catch (MiExepcion ex){
                System.out.println(ex);
            }
            finally {
                System.out.println("Dame un texto");
                texto = sc.nextLine();
                System.out.println(valido);
            }


        }
    }
}
