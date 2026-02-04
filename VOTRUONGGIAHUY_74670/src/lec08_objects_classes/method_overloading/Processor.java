package lec08_objects_classes.method_overloading;

public class Processor {
    public static void main(String[] args) {
        System.out.println(OverloadingExample1.add(1, 2));
        System.out.println(OverloadingExample1.add(1, 2, 3));

        System.out.println(OverloadingExample2.multiply(1, 2));
        System.out.println(OverloadingExample2.multiply(2.5, 4.0));

        OverloadingExample3.printInfo("Tony", 25);
    }
}
