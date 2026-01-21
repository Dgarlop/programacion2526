package unidad2.BoletinMatriz;

public class ejercicio1 {
    static void main(String[] args) {
        ejercicio1 ref = new ejercicio1();
        int [] [] inventario = {
                {5,0,8}, //estante de arriba
                {2,10,0}, //estante del medio
                {0,4,1} //estante de abajo
        };
        ref.detectorDeAgotados(inventario);
        int agotado = ref.contabilizaAgotados(inventario);
    }
    public void detectorDeAgotados (int [][] inventario) {
        int agotado = 0;
        for(int i = 0; i < inventario.length; i++){
            if(inventario[i][0] == 0){
                System.out.println("¡Alerta! Producto agotado en la Fila " + i+ ", Columna 0");
            }
            else{
                for(int j = 0; j < inventario[i].length; j++){
                    if (inventario[i][j] == 0){
                        System.out.println("¡Alerta! Producto agotado en la Fila " + i+ ", Columna " + j);
                    }
                }
            }

        }
    }
    public int contabilizaAgotados(int [][] inventario) {
        int agotado = 0;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i][0] == 0) {
                agotado++;
            } else {
                for (int j = 0; j < inventario[i].length; j++) {
                    if (inventario[i][j] == 0) {
                        agotado++;
                    }
                }
            }
        }
        System.out.println("Hay un total de " + agotado + " productos agotados");
        return agotado;
    }
}
