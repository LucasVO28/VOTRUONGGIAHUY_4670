
package ex4_referencebook;

import ex2_abstract.Book;
import java.util.Scanner;

public class ReferenceBook extends Book {
    private double tax;

    @Override
    public void addBook() {
        Scanner sc = new Scanner(System.in);
        super.addBook();
        System.out.print("Tax: ");
        tax = sc.nextDouble();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Tax: " + tax);
    }
}
