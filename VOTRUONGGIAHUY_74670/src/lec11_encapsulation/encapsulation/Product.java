package lec11_encapsulation.encapsulation;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 1000) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 1000");
        }
    }
}
