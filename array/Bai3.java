
package array;
import java.util.ArrayList;

public class Bai3 {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(20.0);
        prices.add(7.75);
        prices.add(99.9);
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }
    }
}
