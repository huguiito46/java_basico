package tipos_datos_avanzados.arrays;

public class Main {

    public static void main(String[] args) {

       String[] nombres = {"Hugo","Maria","Ana"};

       /*
       forEach nombre es la variable temporal y nombres es el array
        */

        for (String nombre: nombres) {

            System.out.println(nombre);

        }

        System.out.println("---------");

       for(int i=0;i<nombres.length;i++) {

           System.out.println(nombres[i] + " indice " + i);
       }

       /*
       Array Bidimisensional
       1-) Número de filas
       2-) Número de columnas
        Se usan para
        */

        System.out.println("---------");

        /*

        //2 filas por 4 columnas//

        int arrayBidi[][] = {
         {1,2,3,4},
         {10,20,30,40}
         };
         */


       int arrayBidi [] [] = new int[2][4];
       arrayBidi[0][0] = 1;
       arrayBidi[0][1] = 2;
       arrayBidi[0][2] = 3;
       arrayBidi[0][3] = 4;

       arrayBidi[1][0] = 10;
       arrayBidi[1][1] = 20;
       arrayBidi[1][2] = 30;
       arrayBidi[1][3] = 40;

       for (int i = 0;i< arrayBidi.length;i++){
           System.out.println("Valor de i: "+i);

           for (int j=0;j<arrayBidi[i].length;j++){
               System.out.println("Estoy i = "  +i+ ", j = " +j);
               System.out.println(arrayBidi[i][j]);

           }

       }
    }
}
