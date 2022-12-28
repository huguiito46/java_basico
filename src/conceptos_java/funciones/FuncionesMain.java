package conceptos_java.funciones;

public class FuncionesMain {

    public static void main(String[] args) {

        /**
         * Opción 1: Función sin parámetros y sin tipo de retorno
         */

        showMenu();

        /*
        Opción 2: Función sin parámetros y con tipo de retorno
         */

        System.out.println(getPrice());

        /*

        Opción 3: Función con parámetros y sin tipo de retorno

         */
        imprimirSaludoBuenosdias("OpenBootCamp");


        /*

        Opción 4: Función con parámetros y con tipo de retorno

         */

        String saludo = obtenerSaludo("Hugo", "González");
        System.out.println(saludo);


        int resultado = suma(5, 6);
        System.out.println(resultado);


    }



    static int suma(int numero1, int numero2) {

        return numero1 + numero2;
    }

    static String obtenerSaludo(String nombre, String apellido) {

        return "Buenos dias " + nombre + " " + apellido;

    }

    static void imprimirSaludoBuenosdias(String nombre) {

        System.out.println("Buenas tardes " + nombre);


    }

    static double getPrice() {

        return 100.99;

    }

    static void showMenu() {

        System.out.println("Bienvenidos al E-commer de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatilla");
        System.out.println("3 - Salir");

    }

}
