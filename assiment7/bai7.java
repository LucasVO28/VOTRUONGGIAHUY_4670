 
package assiment7;
 

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chu va so: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        System.out.println("cac so trong chuoi la: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}