package conceptos_java.funciones;

/*
Crear una función que reciba un precio y devuelve el precio con el IVA incluido
 */

public class FuncionesSobrecarga {

    public static void main(String[] args) {


    }

    /**
     * @param numero1
     * @param numero2
     * @return
     * Sobrecarga permite duplicar funciones pero siempre que le cambiamos los tipos de
     * parámetros o que tenga más parámetros!
     */

    static int suma(int numero1, int numero2) {

        return numero1 + numero2;

    }

    static int suma(int numero1, int numero2, int numero3) {

        return numero1 + numero2;

    }

}
