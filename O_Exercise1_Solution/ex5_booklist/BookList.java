
package ex5_booklist;

import ex2_abstract.Book;
import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> list = new ArrayList<>();

    public void add(Book b) {
        b.addBook();
        list.add(b);
    }

    public void displayAll() {
        for (Book b : list) {
            b.displayBook();
            System.out.println("-----------------");
        }
    }
}
