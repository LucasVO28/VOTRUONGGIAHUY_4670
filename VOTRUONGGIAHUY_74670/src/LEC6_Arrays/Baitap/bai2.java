package LEC6_Arrays.Baitap;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
