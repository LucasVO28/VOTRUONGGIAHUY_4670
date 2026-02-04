package LEC6_Arrays.Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so ngay: ");
        int n = scanner.nextInt();

        int tong = 0;
        double tb;
        int dem = 0;

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + i + " high temp: ");
            numbers[i] = scanner.nextInt();
            tong += numbers[i];
        }

        System.out.println("Nhiet do cac ngay:");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + i + " high temp: " + numbers[i]);
        }
        tb = tong / n;
        System.out.println("So trung binh la: " + tb);

        for (int i = 0; i < n; i++) {
            if (numbers[i] > tb) {
                dem++;
            }
        }

        System.out.println("So ngay nhiet do tren trung binh: " + dem);

        System.out.println("numbers[]= " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Two coldest days: " + numbers[0] + ", " + numbers[1]);
        System.out.println("Two hottest days: " + numbers[numbers.length - 1]
                + ", " + numbers[numbers.length - 2]);

    }
}
