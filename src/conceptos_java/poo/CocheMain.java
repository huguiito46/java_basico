package conceptos_java.poo;

public class CocheMain {

    public static void main(String[] args) {

        Coche cocheObjeto1 = new Coche("azul","seat","ibiza",1400.4,5.2,100);

        System.out.println(cocheObjeto1);

        Coche cocheObjeto2 = new Coche("rojo","honda","civic",1450.45,5.4,50);

        //cocheObjeto2.acelerar(50);

        System.out.println(cocheObjeto2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Motor electrico honda";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";
        cocheElectrico.peso = 1500.4;
        cocheElectrico.largo = 6.4;
        cocheElectrico.velocidad = 50;

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico1 = new CocheElectrico("Azul","Seat","León",1650.45,6.4,50,"TZX");

        System.out.println(cocheElectrico1);

        cocheElectrico1.acelerar(50);

        System.out.println(cocheElectrico1);

        CocheHibrido cocheHibrido = new CocheHibrido("Azul","Seat","Ibiza",2650.45,6.4,50,"TZA");

        System.out.println(cocheHibrido);



    }
}
