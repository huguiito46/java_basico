package refactoring.consolidate_replace_method.good;

public class ProductPriceCalculator {

    private double price;
    private int quantity;


    public ProductPriceCalculator(Product product){

        this.price = product.getPrice();
        this.quantity = product.getQuantity();

    }

    public double calculatePrice(){

        double result = 0;
        return result;

    }



}
