package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
FileInputStream devuelve una secuencia de bytes
 */

public class Main_leer_fichero1 {

    public static void main(String[] args) {

        /*
        Leer fichero
         */

        try {
            InputStream fichero = new FileInputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/inputStream/fichero.txt");

            try {

                byte[] datos = fichero.readAllBytes();
                for (byte dato : datos) {
                    System.out.print((char)dato);
                }

            } catch (IOException e) {
                System.err.println("No puedo leer el fichero " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Oye el programa da error " + e.getMessage());

        }
    }

}
