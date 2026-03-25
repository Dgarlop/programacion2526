package unidad4.Clone.Boletin.Controller;

import unidad4.Clone.Boletin.Models.Coche;
import unidad4.Clone.Boletin.Models.Combustible;
import unidad4.Clone.Boletin.Models.Motor;

public class GestionaCoches {
    static void main(String[] args) {
        //Clonar motor
        Motor motor1 = new Motor(Combustible.gasolina, 100, false);
        Object motor2 = null;
        try {
            motor2 = (Motor) motor1.clone();
        }catch(CloneNotSupportedException e) {
            System.out.println("Error al clonar");
        }
        Motor motor3 = (Motor) motor2;
        motor3.setTipo(Combustible.diesel);
        System.out.println(motor1);
        System.out.println(motor3);

        //Clonar coche

        Coche coche1 = new Coche("1234ABC", "Lamborguini", 10000,motor1);
        Object coche2 = null;
        try {
            coche2 = (Coche) coche1.clone();
        }catch(CloneNotSupportedException e) {
            System.out.println("Error al clonar");
        }
        Coche coche3 = (Coche) coche2;
        coche3.getMotor().setTipo(Combustible.electrico);
        System.out.println(coche1);
        System.out.println(coche3);

    }
}
