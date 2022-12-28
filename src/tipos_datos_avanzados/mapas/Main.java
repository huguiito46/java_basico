package tipos_datos_avanzados.mapas;

import java.util.HashMap;
import java.util.Map;

/*
 HashMap clave y valor es el principal
 Existen tambien TreeMap y LinkedHashMap y muchas más que hay que observa en la api de java

 */

public class Main {

    public static void main(String[] args) {



        HashMap<String,Integer> mapa = new HashMap<>();

        mapa.put("Clave 1" ,10);
        mapa.put("Clave 2" ,20);
        mapa.put("Clave 3" ,30);
        mapa.put("Clave 4" ,40);

        System.out.println(mapa); // Valores del mapa

        System.out.println("--------------------");

        mapa.remove("Clave 1"); // Eliminar clave 1
        mapa.replace("Clave 4",50); // Reemplazar claves
        System.out.println(mapa);

        System.out.println("--------------------");


        for (Map.Entry<String,Integer> elemento : mapa.entrySet()){

            System.out.println("Elemento clave: " +elemento.getKey() +" Elemento valor: " +elemento.getValue());

        }


    }

}
