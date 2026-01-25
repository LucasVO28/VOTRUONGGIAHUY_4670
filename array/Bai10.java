 
package array;
import java.util.ArrayList;
import java.util.HashSet;

public class Bai10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("An");
        names.add("Binh");
        names.add("An");
        names.add("Cuong");
        names.add("Binh");
        ArrayList<String> result = new ArrayList<>(new HashSet<>(names));
        System.out.println(result);
    }
}
