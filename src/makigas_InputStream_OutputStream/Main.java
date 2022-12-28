package makigas_InputStream_OutputStream;

import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        //escribirFichero();
        //leerFichero();

        //escribirObjeto();
        //leerObjeto();

        //escribirEmpleados();
        leerEmpleados();


    }


    static void escribirFichero() {

        try {
            OutputStream escribir = new FileOutputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/datos.txt");

            for (int i = 0x10; i <= 0x19; i++) {
                escribir.write(i);
            }
            escribir.flush();
            escribir.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No se ha podido crear en el fichero datos.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha podido escribit en el fichero datos.txt");
        }


    }


    static void leerFichero() {

        try {
            InputStream leer = new FileInputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/datos.txt");
            byte[] array = new byte[4096];
            System.out.println(leer.read(array, 200, 5));
            System.out.println(leer.read(array, 300, 10));
            leer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha podido leer el fichero");
        }

    }


    static void escribirObjeto() {

        try {
            OutputStream fos = new FileOutputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/objetos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            ArrayList<String> elementos = new ArrayList<>();
            elementos.add("Hola");
            elementos.add("Adios");
            elementos.add("Buenas");

            oos.writeDouble(3.5);
            oos.writeBoolean(true);
            oos.writeLong(2321321312313L);
            oos.writeUTF("Hola mundo");
            oos.writeObject(elementos);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static void leerObjeto() {

        try {
            InputStream fis = new FileInputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/objetos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println(ois.readDouble());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readLong());
            System.out.println(ois.readUTF());

            ArrayList<String> list = (ArrayList<String>) ois.readObject();
            System.out.println(list.size());

        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    static void escribirEmpleados() {

        /*
        Serialización --> Nos permite volcar una serie de clases, como si fuera una serie de bytes enviarlos.

         */

        var empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Enrique", "Verde", "Comercial"));
        empleados.add(new Empleado("Ana", "Sanchez", "Ingeniería"));
        empleados.add(new Empleado("Antonio", "Gómez", "Contabilidad"));
        empleados.add(new Empleado("Laura", "Hojas", "Presidencia"));

        try {
            var fos = new FileOutputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/empleados.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    static void leerEmpleados() {

        ArrayList<Empleado> lista = new ArrayList<>();

        try {
            var fis = new FileInputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/empleados.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Empleado>) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(lista.size());

        for (Empleado e : lista) {

            System.out.println(e);

        }


    }

    static void escribirNumeros() {

        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/numero.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            for (int i = 0; i <= 255; i++) {
                bos.write(i);
            }
            bos.flush();

        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    static void escribirCadenas() {

        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/Hugo/OpenBootCam/DocumentacionJava/src/makigas_InputStream_OutputStream/cadenas.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oss = new ObjectOutputStream(bos);

            for (int i = 0; i <= 255; i++) {
                oss.writeUTF("Cadena " + i + "\n");
            }
            oss.flush();

        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}

