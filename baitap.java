package lec5;

import java.util.*;
import java.util.Scanner;

public class baitap {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int huy1 = rand.nextInt(100);
        double huy2 = 1.8 + rand.nextDouble() * (8.0 - 1.8);
        int huy3 = rand.nextInt(80 - 3 + 1) + 3;
        int huy4 = rand.nextInt(100 - 1 + 1) + 1;
        double huy5 = 1.0 + rand.nextDouble() * (100.0 - 1.0);
        int huy6 = rand.nextInt(10 - 1 + 1) + 1;

        System.out.println("-so tuoi cua huy la " + huy1);
        System.out.println("-Xac xuat trung so " + huy2);
        if (huy3 % 2 == 0) {
            System.out.println("-so " + huy3 + " la so chan}}}");
        } else {
            System.out.println("-so " + huy3 + " la so le}}}");
        }
        System.out.println("-so nguyen la: " + huy4);
        System.out.println("-so thuc la: " + huy5);
        if (huy4 > huy5) {
            System.out.println("--->so nguyen lon hon so thuc");
        } else if (huy4 < huy5) {
            System.out.println("--->so thuc nho hon so nguyen");
        } else if (huy4 == huy5) {
            System.out.println("--->so nguyen bang so thuc");
        }
        System.out.println("so nguyen cua bai 5 la: " + huy6);
        for (int i = 1; i <= 10; i++) {
            if (i == huy6) {
                System.out.println(huy6 + " dung ");
                break;
            }
            System.out.print(i + " ");
        }
        do {
            System.out.print("Nhap so nguyen: ");
            int huy = scanner.nextInt();

            if (huy > huy4) {
                System.out.println("Nho hon!");
            } else if (huy < huy4) {
                System.out.println("Lon hon!");
            } else {
                System.out.println("Chuc mung!");
                break;
            }

        } while (true);
    }
    }
