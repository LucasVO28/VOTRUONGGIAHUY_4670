 
package assiment7;
 
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ky tu: ");
        String S = scanner.nextLine();
        StringBuilder DAONGUOC = new StringBuilder(S);
        DAONGUOC.reverse();
        System.out.println(DAONGUOC.toString());
    }   
}