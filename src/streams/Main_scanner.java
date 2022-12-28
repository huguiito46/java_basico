package streams;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_scanner {

    public static void main(String[] args) {

        boolean ok = false;

        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("Mete dos números");

            try{
                int a = teclado.nextInt();
                int b = teclado.nextInt();
                ok = true;

                System.out.println("Variable a " +a);
                System.out.println("Variable b " +b);

            }catch (InputMismatchException e){
                System.err.print("Números invalidos");
            }

        }while (!ok);

    }

}
