package unidad3.exepciones.boletinE3.ejercicio1;

public class CaracterNoTraducibleException extends Exception {
    public CaracterNoTraducibleException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "CaracterNoTraducibleException{}";
    }
}