package tipos_datos_avanzados.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        String array [] = new String[lista.size()];

        for (int i=0;i<lista.size();i++){
            array[i] = lista.get(i);
        }
        for (String elemento : array){
            System.out.println("Elemento es " +elemento);
        }


        /*
        Tambien aquí
         */

        for (Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());

        }


        /*
        Es similar a un ArrayList, pero su fundamental uso es a la hora de la modificación de sus elementos su ejecución es mucho más rapida que un ArrayList
         */

        LinkedList<String> listaenlazada = new LinkedList<>(lista);



    }
}
