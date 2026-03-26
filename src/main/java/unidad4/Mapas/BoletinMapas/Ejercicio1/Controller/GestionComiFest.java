package unidad4.Mapas.BoletinMapas.Ejercicio1.Controller;

import unidad4.Mapas.BoletinMapas.Ejercicio1.Models.EntradaVip;
import unidad4.Mapas.BoletinMapas.Ejercicio1.Models.Influencer;
import unidad4.Mapas.BoletinMapas.Ejercicio1.Models.RegsitroEntrada;
import unidad4.Mapas.BoletinMapas.Ejercicio1.Models.TipoEntrada;

import java.time.LocalDate;

public class GestionComiFest {
    static void main(String[] args) {
        Influencer i1 = new Influencer("Diego","Garcia",10,"Twitch");
        Influencer i2 = new Influencer("Maria","Fernandez",5000,"Youtube");
        Influencer i3 = new Influencer("Lopez","Cayon",500,"Youtube");
        EntradaVip eV1 = new EntradaVip(TipoEntrada.GOLD,1, LocalDate.now());
        EntradaVip eV2 = new EntradaVip(TipoEntrada.GOLD,2, LocalDate.now());
        EntradaVip eV3 = new EntradaVip(TipoEntrada.GOLD,3, LocalDate.now());
        RegsitroEntrada rEntrada = new RegsitroEntrada();
        rEntrada.agregarEntrada(eV1, i1);
        rEntrada.agregarEntrada(eV3, i3);
        rEntrada.agregarEntrada(eV2, i2);
        System.out.println("-------Confirmar---------");
        rEntrada.confirmarEntrada(eV1, i1);
        rEntrada.confirmarEntrada(eV3, i3);
        System.out.println("-------Cancelar---------");
        rEntrada.cancelarEntrada(eV2, i2);
        System.out.println("-----ListaConfirmar----------");
        rEntrada.listaConfirmados();
        System.out.println("-----ListaCancelada----------");
        rEntrada.listaCancelados();
        System.out.println("-----Top 3 influencers----------");
        rEntrada.numSeguidores();




    }
}
