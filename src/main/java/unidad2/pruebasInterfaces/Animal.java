package unidad2.pruebasInterfaces;

public class Animal extends SerVivo{
    public void comer(){

    }
    public void respira(){

    }


    @Override
    public boolean estaVivo() {
        return false;
    }

    @Override
    public boolean seDesplaza() {
        return false;
    }
}
