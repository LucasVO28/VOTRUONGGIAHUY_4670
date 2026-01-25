 
package array;
import java.util.ArrayList;
import java.util.Collections;

public class Bai9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(2);
        list.add(18);
        System.out.println("Lon nhat: " + Collections.max(list));
        System.out.println("Nho nhat: " + Collections.min(list));
    }
}

