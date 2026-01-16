package unidad2.boletin1_java;

public class ejercicio1 {
    static void main(String[] args) {
        ejercicio1 referencia = new ejercicio1();
        int x = 144;
        int y = 999;
        int resSuma = referencia.sumar(x,y);
        System.out.println(resSuma);
        int resResta = referencia.resta(x,y);
        System.out.println(resResta);
        int resDivi = referencia.division(x,y);
        System.out.println(resDivi);
        int resMulti = referencia.multiplicar(x,y);
        System.out.println(resMulti);
    }
        public int sumar(int x, int y){
            int resultado = x + y;
            return resultado;
        }
        public int resta(int x, int y){
            int resultado = x - y;
            return resultado;
        }
        public int division(int x, int y){
            int resultado = x / y;
            return resultado;
        }
        public int multiplicar(int x, int y){
            int resultado = x * y;
            return resultado;
        }


}