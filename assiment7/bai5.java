package assiment7;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chuoi: ");
        String S = scanner.nextLine();

        System.out.println("nhap ki tu can dem: ");
        char c = scanner.next().charAt(0);

        int dem = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == c) {
                dem++;
            }
        }

        System.out.println("ky tu" + c + "xuat chia" + dem + "lan cuoi trong chuoi.");
    }
}
