package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main_leer_fichero2 {
    /*
FileInputStream devuelve una secuencia de bytes
 */

    public static void main(String[] args) {

        /*
        Leer fichero
         */

        try {
            InputStream fichero = new FileInputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/inputStream/fichero.txt");

            try {

                int dato = fichero.read();
                while(dato != -1){
                    System.out.print((char)dato);
                    dato = fichero.read();
                }

            } catch (IOException e) {
                System.err.println("No puedo leer el fichero " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Oye el programa da error " + e.getMessage());

        }
    }
}
