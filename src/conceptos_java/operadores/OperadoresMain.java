package conceptos_java.operadores;

public class OperadoresMain {

    public static void main(String[] args) {


        /*
         Operadores comparación
        +
        -
        *
        %
        */
        int numero1 = 20;
        int numero2 = 10;
        int resultadoSuma = numero1 + numero2;
        int resultadoResta = numero1 - numero2;
        int resultadoMultiplicacion = numero1 * numero2;
        int resultadoDivision = numero1 / numero2;


        System.out.println("Suma " + resultadoSuma);
        System.out.println("Resta" + resultadoResta);
        System.out.println("Multiplicacion " + resultadoMultiplicacion);
        System.out.println("División " + resultadoDivision);

        /*
        Comparación:
        >
        <
        >=
        <=
        ==
         */

        boolean resultado1 = numero1 > numero2;
        System.out.println(resultado1);

        boolean resultado2 = numero1 < numero2;
        System.out.println(resultado2);

        boolean resultado3 = numero1 > 5 && numero1 < 30;
        System.out.println(resultado3);

        int edad = 17;
        boolean carnetJoven = edad >=15 && edad <= 16;
        System.out.println(carnetJoven);


        // operadores
        // incremento ++
        // decremento --



    }

}
