package array;

import java.util.ArrayList;
import java.util.Random;

public class Bai5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(100) + 1);
        }
        list.remove(3);
        System.out.println(list);
    }
}
