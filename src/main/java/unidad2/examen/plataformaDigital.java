package unidad2.examen;

import java.util.Scanner;

public class plataformaDigital {
    static void main() {
        plataformaDigital ref = new plataformaDigital();
        Scanner sc = new Scanner(System.in);
        String [] informacion = {"alex@netflix23@","bea@hbo_pass@","carlos{prime99@","dani@disneyPlus1@","elena@movistar22@","fran@sky_77@","laura@atresPlayer@","pablo@filmin88@","sofia@stream2024@","admin@root@"};
        ref.Menu(informacion);
        ref.mostrarUsurios(informacion);
        String usuario = sc.nextLine();
        String password = sc.nextLine();
        int posicion = ref.buscar(informacion, usuario);
        System.out.println(posicion);

    }
    public void Menu(String [] informacion){
        for (int i = 0; i < informacion.length; i++) {
            System.out.println(informacion[i]);
        }
    }
    public int buscar(String [] informacion, String usuario){
        int posicion = 10;
        String validacion = "[a-z]*.";
        while(posicion == 10){
            for (int i = 0; i < informacion.length; i++){
                if (usuario.matches(validacion)){
                    posicion = i;
                }else{
                    posicion =-1;
                }
            }
        };
        return posicion;
    }
    public boolean InicioSesion(int posicion, String [] informacion, String password){
        Scanner sc = new Scanner(System.in);
        boolean esCorrecto = false;
        String validacion = ".*@*.";

        if (posicion >=0){
            for (int i = 1; i < informacion.length; i++){
                if (i == posicion){
                    if (password.matches(validacion)){
                        esCorrecto = true;
                    }else {
                        esCorrecto = false;
                    }
                }else {
                    esCorrecto = false;
                }

            }
        }
        return false;
    }
    public void mostrarUsurios(String [] informacion){
        String validacion = "[a-z]*.";
        String [] usuarios = new String[10];
        for (int i = 0; i < informacion.length; i++){
            if (informacion[i].matches(validacion)){
                usuarios[i] = informacion[i];
            }
            System.out.println(usuarios[i]);
        }

    }
}
