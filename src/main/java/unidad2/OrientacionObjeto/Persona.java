package unidad2.OrientacionObjeto;

public class Persona {
    String nombre;
    int edad;
    String lugarNacimiento;
    String peliFav;
    String deporteFav;


    //CONSTRUCTORES

    public Persona(String nombre, int edad, String lugarNacimiento, String peliFav, String deporteFav) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.peliFav = peliFav;
        this.deporteFav = deporteFav;
    }
//CONSTRUCTOR POR DEFECTO SIN NIGUN PARAMETRO
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.lugarNacimiento = "";
        this.peliFav = "";
        this.deporteFav = "";
    }


    //METODOS

    void hablar(){
        System.out.println("Hablando: " + nombre);
    };

    boolean haRobado(){
        return false;
    };

    @Override
    public String toString() {
        return "Persona: " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", peliFav='" + peliFav + '\'' +
                ", deporteFav='" + deporteFav + '\'';
    }

    void comer(){
        System.out.println("Comiendo: " + nombre);
    };
}
