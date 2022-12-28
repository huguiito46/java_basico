package tipos_datos_avanzados.string;

public class Main {

    public static void main(String[] args) {

        String cadena = "Mensaje de TEXto";
        //               012345678
        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es " + cadenaMayus);


    /*
    startsWhith devuelve true o false
    endsWitch devuelve true o false
     */

        boolean resultado = cadena.startsWith("Men");
        if (resultado) {
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("No empieza por lo que quiero");
        }

        boolean resultado2 = cadena.endsWith("o");
        if (resultado2) {
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("No empieza por lo que quiero");
        }

        char letra = cadena.charAt(0);
        System.out.println("Carácter es: " +letra);

        // recorrer una cadena
        // por debajo de esto es una array
        for (int i=0;i<cadena.length();i++){
            System.out.println("Carácter actual " +cadena.charAt(i));

        }
    }

}
