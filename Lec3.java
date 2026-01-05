package lec3;

import java.util.Scanner;

public class Lec3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fullname: ");
        String fullname = scanner.nextLine();

        System.out.print("ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hometown: ");
        String H = scanner.nextLine();

        System.out.print("GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Major: ");
        String major = scanner.nextLine();

        System.out.print("Scholarship (true/false): ");
        boolean SC = scanner.nextBoolean();

        System.out.println("\nFullname: " + fullname);
        System.out.println("ID: " + ID);
        System.out.println("Hometown: " + H);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Scholarship: " + SC);
    }
}
