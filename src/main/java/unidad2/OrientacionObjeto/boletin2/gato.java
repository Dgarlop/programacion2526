package unidad2.OrientacionObjeto.boletin2;

import java.util.Scanner;

public class gato {
    String color;
    String raza;
    String sexo;
    int edad;
    int peso;

    public void maulla(){
        System.out.println("miuauuuuu ");
    }

    public void ronronea (){
        System.out.println("rrrrr ");
    }

    public void comida(String tipoComida){
        if (tipoComida == "pescado"){
            System.out.println("Yummy Yummy");
        }else{
            System.out.println("buahhh, mejor no");
        }
    }

    public void pelea(gato g){
        if (this.sexo == g.sexo){
            System.out.println("ven aquí que te vas a enterar");
        }else{
            System.out.println("la violencia nunca es la solución");
        }
    }
}
