 
package array;
import java.util.ArrayList;
import java.util.Random;

public class Bai6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        int chan = 0, le = 0;
        for (int i = 0; i < 15; i++) {
            int x = rd.nextInt(50) + 1;
            list.add(x);
            if (x % 2 == 0) chan++;
            else le++;
        }
        System.out.println(list);
        System.out.println("Chan: " + chan);
        System.out.println("Le: " + le);
    }
}
