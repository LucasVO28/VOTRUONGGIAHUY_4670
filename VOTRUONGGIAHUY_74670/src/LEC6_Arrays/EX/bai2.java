package LEC6_Arrays.EX;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n= ");
        int n = scanner.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("tong n= " + tong);
    }

}
