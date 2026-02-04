package LEC6_Arrays.EX;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap ptr Ax2 + Bx + C = 0");

            System.out.print("Nhap A: ");
            int A = scanner.nextInt();

            System.out.print("Nhap B: ");
            int B = scanner.nextInt();

            System.out.print("Nhap C: ");
            int C = scanner.nextInt();

            if (A == 0) {
                System.out.println("Khong phai phuong trinh bac 2");
                break;
            }
            System.out.println(A + "x2 + " + B + "x + " + C + " = 0");

            int delta = B * B - 4 * A * C;
            System.out.println("Delta = " + delta);
            double candelta = Math.sqrt(delta);
            System.out.println("candelta = " + candelta);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -B / (2.0 * A);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {

                double x1 = (-B + candelta) / (2.0 * A);
                double x2 = (-B - candelta) / (2.0 * A);

                System.out.println("Phuong trinh co 2 nghiem:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }

        } while (true);
    }
}
