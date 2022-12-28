package bucles;

public class For {

    public static void main(String[] args) {

        // Bucle for

        for (int i=0;i<5;i++){
            System.out.println("Hola mundo: " +i);
        }
        System.out.println("---------------------");

        String[] nombres = {"Hugo","Mario","Lucas"};

        for (int i=0;i<nombres.length;i++){

            System.out.println("Nombres en el array " +nombres[i]);
        }




        int suma = 0;
        int [] numeros = {5,7,8};

        for (int i=0;i< numeros.length;i++){

            // suma = suma + numeros[i]
            suma += numeros[i]; // agrega a la variable suma el array, los números 5,7,8

        }

        System.out.println("Suma de los elementos del array: " +suma);

    }

}
