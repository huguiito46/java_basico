package refactoring.consolidate_extract_variable.bad;

public class Order {
    public Double getQuantity;

    public Double getPrice() {


        return 2.1;

    }

    public Double getQuantity() {

        return 4.5;

    }

    public Double getOffer() {

        return 9.3;

    }

    public int getShipping() {

        int resultado = 2;

        return resultado;

    }
}
