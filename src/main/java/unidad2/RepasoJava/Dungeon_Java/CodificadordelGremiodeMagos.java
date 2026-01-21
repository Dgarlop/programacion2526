package unidad2.RepasoJava.Dungeon_Java;

import java.util.Scanner;

public class CodificadordelGremiodeMagos {
    static void main(String[] args) {
        //Referencias
        CodificadordelGremiodeMagos refpurificacion = new  CodificadordelGremiodeMagos();
        CodificadordelGremiodeMagos refverificacion = new  CodificadordelGremiodeMagos();
        CodificadordelGremiodeMagos refAnalisis = new  CodificadordelGremiodeMagos();
        //Pide usuario y contraseña y validamos contraseña
        Scanner ruser = new Scanner(System.in);
        System.out.println("Usuario: ");
        String user = ruser.nextLine();
        Scanner rpass = new Scanner(System.in);
        System.out.println("Contraseña: ");
        String pass = rpass.nextLine();
        boolean verificacion = refverificacion.validacion_credenciales(pass);
        System.out.println(verificacion);
        //Una vez validado la contraseña ponemos el mensaje
        if (verificacion){
            Scanner rconjuro = new Scanner(System.in);
            System.out.println("Indica el conjuro que quieras lanzar: ");
            String conjuro = rconjuro.nextLine();
            String purificar = refpurificacion.purificacion(conjuro);
            System.out.println(purificar);
            int longitud = conjuro.length();
            System.out.println("La longitud es: "+longitud);
        }
    }
    public boolean validacion_credenciales (String pass){
        boolean esValido = false;
        int longitud = pass.length();
        boolean contiene =  pass.contains("#") || pass.contains("*");
        if (longitud >= 8){
            if (contiene){
                esValido = true;
            }
        }
        else{
            esValido = false;
        }
        return esValido;

    }
    public String purificacion(String conjuro){
        conjuro = conjuro.replaceAll("maldicion", "bendicion");
        conjuro = conjuro.toUpperCase();
        return conjuro;
    }
    public void AnalisisYSalida(String mensaje){


    }
}
