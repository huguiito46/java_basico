package streams;

import java.io.*;
import java.util.Scanner;

public class Main_bufferedInputStream {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        /*
        Leer fichero
         */

        try {
            InputStream fichero = new FileInputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/bufferedInputStream/fichero.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {

                int dato = ficheroBuffer.read();
                while(dato != -1){
                    System.out.print((char)dato);
                    dato = ficheroBuffer.read();
                }

            } catch (IOException e) {
                System.err.println("No puedo leer el fichero " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Oye el programa da error " + e.getMessage());

        }
    }

}
