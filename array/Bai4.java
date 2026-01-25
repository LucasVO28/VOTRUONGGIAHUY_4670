
package array;
import java.util.ArrayList;

public class Bai4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("HaNoi");
        cities.add("DaNang");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        System.out.println(cities.contains("London"));
    }
}
