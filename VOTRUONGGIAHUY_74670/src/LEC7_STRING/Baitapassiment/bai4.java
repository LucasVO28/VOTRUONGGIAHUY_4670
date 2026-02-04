 
package LEC7_STRING.Baitapassiment;
 
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.println("Nhập chuỗi ký tự: ");
        String S = scanner.nextLine();
        String result = S.replaceAll("\\s+", " ").trim();
        System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa: " + result);
    }
}