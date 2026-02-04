package lec11_encapsulation.encapsulation;

public class Processor {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(500);
        p.setPrice(1500);
        System.out.println("Price: " + p.getPrice());
    }
}
