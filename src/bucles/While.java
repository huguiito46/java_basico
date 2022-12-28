package bucles;

/*
    Concatenar nombres
    Crear un bucle que permita concatenar textos y imprima el resultado final por consola.
    Los textos pueden venir de un array String

 */

public class While {

    public static void main(String[] args) {

        int contador = 0;


        while (contador < 10) {
            String nombre = "Prueba";
            contador++;

            // Cuando llega al 5, continua a la siguiente iteración y no muestra el 5
            if (contador == 5) {
                continue;
                //break; para la ejecución del bucle cuando el contador es 5!!

            }

            System.out.println("Valor de contador " + contador);
        }


        // System.out.println(nombre); la variable nombre esta fuera del ámbito del que se creo

    }

}
