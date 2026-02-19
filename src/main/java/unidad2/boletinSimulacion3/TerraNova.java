package unidad2.boletinSimulacion3;

public class TerraNova {
    static void main(String[] args) {
        Nave n1 = new Nave("N-1", "Apolo11", 30);
        Nave n2 = new Nave("N-2", "Lunar12", 50);
        MisionExploracion me1 = new MisionExploracion(12,"MisionExploracion1",n1, Estado.PLANIFICADA , "Tierra", 4);
        MisionLogistica ml1 = new MisionLogistica(22,"MisionLogistica1",n2, Estado.PLANIFICADA , 20.0);
        System.out.println(me1.toString());
        System.out.println(ml1.toString());

    }
}
