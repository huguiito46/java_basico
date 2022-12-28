package conceptos_java.poo;

public class CocheHibrido extends Coche {

    String motorHibrido;

    public CocheHibrido(){


    }


    public CocheHibrido(String color,String fabricante,String modelo,Double peso,Double largo,Integer velocidad,String motorHibrido){
        super(color,fabricante,modelo,peso,largo,velocidad);
        this.motorHibrido = motorHibrido;

    }

   @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }

    public static class ArraysMain {

        public static void main(String[] args) {

            String nombre1 = "Hugo";
            String nombre2 = "María";
            String nombre3 = "Carlos";
            String nombre4 = "Vego";

            String nombres[] = new String[4];
            String[] nombres2 = new String[]{nombre1, nombre2, nombre3, nombre4};

            int[] numeros = new int[5];

            Coche[] coches = new Coche[2];

            nombres[0] = nombre1;
            nombres[1] = nombre2;
            nombres[2] = nombre3;
            nombres[3] = nombre4;

            for (int i = 0; i < nombres.length; i++) {
                System.out.println("Posición " + i + " -->" + nombres[i]);
            }
        }

    }
}
