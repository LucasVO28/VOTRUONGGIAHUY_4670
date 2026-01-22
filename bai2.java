package lec7;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("nhap ten sv thu nhat " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }

        System.out.println("\nDanh sach:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
