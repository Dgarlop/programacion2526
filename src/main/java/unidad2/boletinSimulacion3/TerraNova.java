package unidad2.boletinSimulacion3;

public class TerraNova {
    static void main(String[] args) {
        Nave n1 = new Nave("N-1", "Apolo11", 30);
        MisionExploracion me1 = new MisionExploracion(12,"MisionExploracion1",n1, Estado.PLANIFICADA , "Tierra", 4);
        System.out.println(me1.toString());

    }
}
