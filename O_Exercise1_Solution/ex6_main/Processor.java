
package ex6_main;

import ex3_textbook.TextBook;
import ex4_referencebook.ReferenceBook;
import ex5_booklist.BookList;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList list = new BookList();

        while (true) {
            System.out.println("1. Add TextBook");
            System.out.println("2. Add ReferenceBook");
            System.out.println("3. Display all");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    list.add(new TextBook());
                    break;
                case 2:
                    list.add(new ReferenceBook());
                    break;
                case 3:
                    list.displayAll();
                    break;
                case 0:
                    return;
            }
        }
    }
}
