package tipos_datos_avanzados.vectores;

/*
Cuando creamos un vector estamos creado un array dinámico.
Se amplian automáticamente.
Crecer decrecer un array no es computacionamelmente valido hablando.
 */

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(1); //Añadir elementos
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Vector tamaño " +vector.size() + " y capacidad: " +vector.capacity()); // Elementos añadidos
        System.out.println("Números en el vector " +vector);

        //vector.trimToSize();
        System.out.println(vector.size()  + " Size");


        System.out.println("-------------------------");

        for (int i: vector){
            System.out.println("Valor actual en vector " +i);
        }

        System.out.println("-----------------------------");

        for (int i=0 ;i < vector.size(); i++){

            if (i % 2 == 0){
                vector.remove(i);


            }
            System.out.println("Valor es  " +vector.get(i) +" en posición " +i);

        }
    }
}
