package refactoring.consolidate_replace_method.good;

public class Product {

    double price;
    int quantity;
    double discount;
    double shipping;

    // Constructores

    // Métodos

    // toString


    public double calculatePrice(){

        return new ProductPriceCalculator(this).calculatePrice();

    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}

