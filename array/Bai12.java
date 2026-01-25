package array;

import java.util.ArrayList;
import java.util.Random;

public class Bai12 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        int tong = 0;
        for (int i = 0; i < 10; i++) {
            int x = rd.nextInt(100) + 1;
            list.add(x);
            tong += x;
        }
        System.out.println(list);
        System.out.println("Tong: " + tong);
    }
}
