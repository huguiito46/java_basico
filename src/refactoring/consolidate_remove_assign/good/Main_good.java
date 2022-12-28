package refactoring.consolidate_remove_assign.good;

import refactoring.consolidate_remove_assign.bad.Order;

public class Main_good {

    double calculateDiscount(Order order, double totalPrice) {

        double result = totalPrice;

        if (order == null || order.getPrice() == null) // programación defensiva
            return result;


        if (order.getPrice() > 100)
            result += order.getPrice() * order.getOffer(); // Sobreescribe total price
        return result;

    }


}
