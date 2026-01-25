 
package array;
import java.util.ArrayList;

public class Bai8 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Mango");
        list1.add("Grape");
        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
}
