package conceptos_java.poo;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        //Polimorfismo
        /*
        Cuando utilizamos polimorfismo estamos usando la clase
        que está por encima, es decir la clase base
         */


        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if(coche4 instanceof CocheElectrico){
            System.out.println("Coche electrico");

        }

        if (coche4 instanceof CocheHibrido){

            System.out.println("Coche hibrido");

        }

    }

}
