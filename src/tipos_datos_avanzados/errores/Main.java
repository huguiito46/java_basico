package tipos_datos_avanzados.errores;

/*
Tipos de errores

1.) En tiempo de ejecución
2.) De compilación por ejemplo olvidarnos un ; es un error sintantico
3.) Error logico o error humano tu logica esta mal!

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números");

        int numeroA = teclado.nextInt();
        int numeroB = teclado.nextInt();

        try{
            int resultado = numeroA / numeroB; // Si divides cualquier número entre 0, es un error de ejecución
            System.out.println("El resultado es " +resultado);
        }catch (ArithmeticException e){
            System.err.println("Error excepción es  " +e.getClass());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Estoy en una excepción que no es aritmética");
        }finally {
            System.out.println("FINALY");
        }


        int tempetura = 25;
        if(tempetura <= 25){ // Error logico esto no es logico!!!
            System.out.println("Hace frio");
        }
    }

}
