
package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bai11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(100) + 1);
        }
        System.out.println(list);
        System.out.println("Lon nhat: " + Collections.max(list));
        System.out.println("Nho nhat: " + Collections.min(list));
    }
}

