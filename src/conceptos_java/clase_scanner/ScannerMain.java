package conceptos_java.clase_scanner;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        /*
        La clase System.in es la entrada
        La clase System.out es la salida por eso system.out.printl muestra datos String o enteros

         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        System.out.println("El nombre introducido es " +nombre);
        System.out.println("El número introducido es " +numero);



    }

}
