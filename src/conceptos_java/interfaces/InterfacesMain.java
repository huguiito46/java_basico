package conceptos_java.interfaces;

import conceptos_java.poo.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        //Polimorfismo

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();






    }


}
