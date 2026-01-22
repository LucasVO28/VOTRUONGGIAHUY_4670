package lec7;

import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            list.add(sc.nextInt());
        }

        hienThi(list);             // Câu A
        hienThiChan(list);         // Câu B
        tinhTong(list);            // Câu C
        xoaPhanTu(list);           // Câu D
    }

    public static void hienThi(ArrayList<Integer> list) {
        System.out.println("\nDanh sach mang: " + list);
    }

    public static void hienThiChan(ArrayList<Integer> list) {
        int count = 0;
        System.out.println("\ngia tri chan:");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("gia tri: " + list.get(i) + " tai vi tri: " + i);
                count++;
            }
        }
        System.out.println("ong co " + count + " so chan.");
    }

    public static void tinhTong(ArrayList<Integer> list) {
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        System.out.println("\ntong gia tri trong mang: " + sum);
    }

    public static void xoaPhanTu(ArrayList<Integer> list) {
        System.out.print("\ngia tri can xoa: ");
        int value = sc.nextInt();

        if (list.contains(value)) {
            list.remove(Integer.valueOf(value));
            System.out.println("mang con lai la: " + list);
        } else {
            System.out.println("ko co gtri trong mang");
        }
    }
}
