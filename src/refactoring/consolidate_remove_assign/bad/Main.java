package refactoring.consolidate_remove_assign.bad;

public class Main {

    /*
   Esto es una función impura
     */


    double calculateDiscount(Order order, double totalPrice) {

        if (order == null || order.getPrice() == null) // programación defensiva
            return totalPrice;


        if (order.getPrice() > 100)
            totalPrice += order.getPrice() * order.getOffer(); // Sobreescribe total price
        return totalPrice;

    }

}
