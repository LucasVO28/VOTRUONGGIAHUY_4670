
package ex2_abstract;

import ex1_interface.IBook;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook {
    protected String id;
    protected String publisher;
    protected Date entryDate;
    protected double unitPrice;
    protected int quantity;

    @Override
    public void addBook() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("ID: ");
            id = sc.nextLine();
            System.out.print("Publisher: ");
            publisher = sc.nextLine();
            System.out.print("Unit price: ");
            unitPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Entry date (dd/MM/yyyy): ");
            entryDate = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void displayBook() {
        System.out.println(id + " | " + publisher + " | " + unitPrice + " | " + quantity);
    }
}
