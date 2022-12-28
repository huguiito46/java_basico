package tipos_datos_avanzados.errores_thows;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
     try{
       int result =  divide(4,0);
         System.out.println(result);
     }catch (Exception e){
         System.out.println("AAA");
     }



    }

    public static int divide (int a,int b) throws ArithmeticException, IOException {
        int resultado;

        try{
           resultado = a / b;
        }catch (ArithmeticException e){
            throw new IOException();
        }
        return resultado;

    }

}
