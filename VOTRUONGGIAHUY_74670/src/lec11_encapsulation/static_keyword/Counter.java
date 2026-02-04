package lec11_encapsulation.static_keyword;

public class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }
}
