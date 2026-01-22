package unidad2.expresionesRegulares;

public class ejercicio1 {
    static void main(String[] args) {
        String cadena = "123456789";
        String validaNumeros="[0-9]+";
        String cadena2 = "123456";
        String validaLetras=".*[a-z]*";
        String contrasena = "12345678";
        String validaContrasena = "\\d{8}";
        String matricula = "1234ABW";
        String patronMatricula = "\\d{4}[a-zA-Z]{3}";
        System.out.println(cadena+" "+cadena.matches(validaNumeros));
        System.out.println(cadena2+" "+cadena.matches(validaLetras));
        System.out.println(contrasena+ " " + contrasena.matches(validaContrasena));
        System.out.println(matricula+ " " + matricula.matches(patronMatricula));

    }
}
