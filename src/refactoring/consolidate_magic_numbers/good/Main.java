package refactoring.consolidate_magic_numbers.good;

public class Main {

    /*
    Constante con final no es posible ser modificada.
    Siempre van en mayúsculas
     */
    private static final double PRECIO_MINIMO_COMPRA = 100;
    private static final double PRECIO_ENVIO = 4.99;
    private static final double ENVIO_GRATIS = 0;
    private static final double DESCUENTO = 0.1;

    public static void main(String[] args) {

        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);


    }

    private static double calculateShipping(double price) {

        return price < PRECIO_MINIMO_COMPRA ? PRECIO_ENVIO : ENVIO_GRATIS;  // hard core

        /*
        Si el precio es menor de 100 te devuelvo 4.99
        si no te devuelvo 0
         */


    }

    private static double calculateDiscount(double price) {

        return price * DESCUENTO;

    }

}
