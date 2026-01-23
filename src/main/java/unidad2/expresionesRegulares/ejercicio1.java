package unidad2.expresionesRegulares;

public class ejercicio1 {
    static void main(String[] args) {
        //1
        String cadena = "123456789";
        String validaNumeros="[0-9]+";
        System.out.println(cadena+" "+cadena.matches(validaNumeros));

        //2
        String cadena2 = "123456";
        String validaLetras=".*[a-z]*";
        System.out.println(cadena2+" "+cadena.matches(validaLetras));

        //3
        String contrasena = "123456ab";
        String validaContrasena = ".{8,}";
        System.out.println(contrasena+ " " + contrasena.matches(validaContrasena));

        //4
        String matricula = "1234ABW";
        String patronMatricula = "\\d{4}[a-zA-Z]{3}";
        System.out.println(matricula+ " " + matricula.matches(patronMatricula));

        //5
        String cadena5 = "DAM Diego";
        String validaCadena5 = "^DAM.*";
        System.out.println(cadena5+ " " + cadena5.matches(validaCadena5));

        //6
        String cadena6 = "DAM Diego 1";
        String validaCadena6 = ".*[^0-9].*";
        System.out.println(cadena6+ " " + cadena6.matches(validaCadena6));

        //7
        String [] cadena7 = {"12345678A", "12345678B", "1234567C"};
        String validaCadena7 = "\\d{8}[a-zA-Z]{1}";
        for (int i = 0; i < cadena7.length; i++) {
            if(cadena7[i].matches(validaCadena7)){
                System.out.println(cadena7[i]);
            }
        }
    }
}
