
package ex3_textbook;

import ex2_abstract.Book;
import java.util.Scanner;

public class TextBook extends Book {
    private String status;

    @Override
    public void addBook() {
        Scanner sc = new Scanner(System.in);
        super.addBook();
        System.out.print("Status: ");
        status = sc.nextLine();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Status: " + status);
    }
}
