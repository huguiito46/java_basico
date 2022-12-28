package conceptos_java.arrays;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    /*
    Un Map en Java es una estructura de datos que guarda elementos en pares clave-valor,
    donde clave (key) es un identificador único de un valor(value) dado:
     */


    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("70419272A", "Hugo González Casillas");
        personas.put("70419272B", "Pablo González Casillas");
        personas.put("70419272C", "Maria González Casillas");
        personas.put("70419272G", "Eva González Casillas");
        personas.put("70419272H", "David González Casillas");

        //System.out.println(personas);

        //Muestra la key//

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        System.out.println("------------------------");

        //Mostramos el valor//

        for (String value : personas.values()) {

            System.out.println(value);

        }

        //Mostramos clave y mapa//

        for (Map.Entry<String, String> pair : personas.entrySet()) {

            System.out.println(pair.getKey() + " / " + pair.getValue());

        }

    }
}
