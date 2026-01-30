package unidad2.OrientacionObjeto.boletin2;

public class NotaAsignatura {
    String nombre;
    int notaPrimerTimestre;
    int notaSegundoTimestre;
    int notaTerceroTimestre;


    //contructor
    public NotaAsignatura(int notaTerceroTimestre, int notaSegundoTimestre, int notaPrimerTimestre, String nombre) {
        this.notaTerceroTimestre = notaTerceroTimestre;
        this.notaSegundoTimestre = notaSegundoTimestre;
        this.notaPrimerTimestre = notaPrimerTimestre;
        this.nombre = nombre;
    }

    //metodos
    public void NotaMedia(){
        int notaMedia = notaPrimerTimestre + notaSegundoTimestre + notaTerceroTimestre / 3;
        System.out.println("Nota media: " + notaMedia);
    }

    void TrimestreAprobados(){
        int contador = 0;
        if(notaTerceroTimestre >= 5){
            contador++;
            System.out.println("Trimestre aprobado");
        }else{
            System.out.println("Trimestre suspendido");
        }
        if(notaSegundoTimestre >= 5){
            contador++;
            System.out.println("Trimestre aprobado");
        }else{
            System.out.println("Trimestre suspendido");
        }
        if(notaPrimerTimestre >= 5){
            contador++;
            System.out.println("Trimestre aprobado");
        }else{
            System.out.println("Trimestre suspendido");
        }
        System.out.println("Has aprobado un total de : " + contador + " trimestres");
    }

    @Override
    public String toString() {
        return "NotaAsignatura{" +
                "nombre='" + nombre + '\'' +
                ", notaPrimerTimestre=" + notaPrimerTimestre +
                ", notaSegundoTimestre=" + notaSegundoTimestre +
                ", notaTerceroTimestre=" + notaTerceroTimestre +
                '}';
    }
}
