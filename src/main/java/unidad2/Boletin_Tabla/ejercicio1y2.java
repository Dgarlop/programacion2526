package unidad2.Boletin_Tabla;

public class ejercicio1y2 {
    static void main(String[] args) {
        String[] DiasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for (int i = 0; i<DiasSemana.length; i++) {
            System.out.println(DiasSemana[i]);
            if (DiasSemana[i].equals("Sabado") || DiasSemana[i].equals("Domingo")){
                System.out.println("Festivo");
            }
            else {
                System.out.println("Laborable");
            }
        }
    }
}
