package bucles;

public class ForEach {

    public static void main(String[] args) {

        String [] nombres = {"Pepe","Hugo","Maria"};

        int suma1 = 0;


        for (String nombre : nombres) {

            System.out.println(nombre);

        }

        System.out.println("--------------------");

        int suma = 0;
        int [] numeros = {5,10,15};

        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println(suma);


    }
}
