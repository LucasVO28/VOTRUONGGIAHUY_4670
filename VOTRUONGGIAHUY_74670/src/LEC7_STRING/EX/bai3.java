
package LEC7_STRING.EX;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap so thuc thu " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        System.out.print("day vua nhap: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}
