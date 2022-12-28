package conceptos_java.arrays;

import conceptos_java.poo.Coche;

import java.util.ArrayList;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Hugo");
        nombres.add("Maria");
        nombres.add("David");
        nombres.add("Carlos");
        nombres.add("Lucas");

        //System.out.println("ArrayList de String " + nombres) ;

        for (String nombre : nombres) {

            System.out.println("ArrayList de String --> " + nombre);
        }


        List<Integer> numeros = new ArrayList<>();

        numeros.add(27);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("--------------------------");

        for (Integer numero : numeros) {

            System.out.println("ArrayList de números " + numero);
        }

        List<Coche> coches = new ArrayList<>();

        System.out.println("---------------------------");

        coches.add(new Coche("honda civic"));
        coches.add(new Coche("seat ibiza"));
        coches.add(new Coche("seat león"));
        coches.add(new Coche("porche cayanne"));
        coches.add(new Coche("volkswagen golf gti"));


        for (Coche coche :coches) {

            System.out.println("ArrayList de objetos-coche --> " +coche);

        }

    }

}
