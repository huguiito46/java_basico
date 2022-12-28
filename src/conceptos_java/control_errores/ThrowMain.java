package conceptos_java.control_errores;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try {
            leerNombres();
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

    }

    /*

    Método que lee nombres de consola y verifica que tengan logintud igual o mayor que 8
    caracteres
    @throws NameFormatExcepcion

     */


    private static void leerNombres() throws NameNotFoundException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameNotFoundException("El nombre debe contener 8 caracteres");
            }
        }


    }

}
