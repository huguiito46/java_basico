package refactoring.consolidate_magic_numbers.bad;

public class Main {


    public static void main(String[] args) {

        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);


    }

    private static double calculateShipping(double price) {

        return price < 100 ? 4.99 : 0;  // hard core

        /*
        Si el precio es menor de 100 te devuelvo 4.99
        si no te devuelvo 0
         */


    }

    private static double calculateDiscount(double price) {

        return price * 0.1;

    }

}
