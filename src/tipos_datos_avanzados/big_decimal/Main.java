package tipos_datos_avanzados.big_decimal;

/*
Lo que requiera una gran preción nunca vamos a usar ni float ni double
Usamos la clase BigDecimal para cosas financieras

 */


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

       // System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f+ 0.1f + 0.1f + 0.1f);

        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        //valorA.multiply(valorB);
        //valorA.add(valorB);

        // Suma el BigDecimal "valorB" a "valorA";
        BigDecimal resultado = valorA.add(valorB);

        System.out.println(valorA.toString());

    }

}
