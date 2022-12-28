package refactoring.consolidate_extract_variable.good;

import refactoring.consolidate_extract_variable.bad.Order;

public class Main {


    void printProductPrice(Order order){

        //Calcular precio total//


        // 1. Precio de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        // 2. Descuento
        Double offerPrice = order.getPrice() * order.getOffer();

        // 3. Calcular precio prodcutos con el descuento incluido.
        Double finalPrice = quantityPrice - offerPrice;

        Double shippingCost = 0.0;

        if (finalPrice < 50 ){
            shippingCost = 2.99;

        }

        // precio definitivo
        System.out.println(finalPrice +shippingCost);

    }


}
