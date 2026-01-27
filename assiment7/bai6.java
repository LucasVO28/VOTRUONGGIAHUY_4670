 
package assiment7;
 

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String S = scanner.nextLine();

        System.out.println("nhap tu can thay the: ");
        String tumuondoi = scanner.nextLine();

        System.out.println("nhap tu thay the: ");
        String tumoi = scanner.nextLine();

        String h = S.replace(tumuondoi, tumoi);

        System.out.println("chuoi khi thay the: " + h);
    }
}