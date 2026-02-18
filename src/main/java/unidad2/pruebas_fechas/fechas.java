package unidad2.pruebas_fechas;
import java.time.LocalDate;
public class fechas {
    static void main(String[] args) {
        //1. Fecha actual (now)
        LocalDate hoy = LocalDate.now();
        // 2. Fecha específica (of) -> Año, Mes, Día
        // Nota: ¡Aquí Enero es 1! Mucho más intuitivo.
        LocalDate finDeCurso = LocalDate.of(2024, 6, 21);

        // Creación de un String  Desde un texto (parse)
        // Formato estándar ISO-8601 (Año-Mes-Día)
        LocalDate diaProgramador = LocalDate.parse("2024-09-13");
        System.out.println("Día del programador: " + diaProgramador);

        if (diaProgramador.plusDays(7).isBefore(hoy)) {
            System.out.println("Es antes");
        }
        else {
            System.out.println("Es despues");
        }
    }
}
