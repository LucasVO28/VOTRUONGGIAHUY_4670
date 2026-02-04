package lec08_objects_classes.constructor;

public class Processor {
    public static void main(String[] args) {
        Bike b = new Bike();

        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan", 25);

        s1.display();
        s2.display();
    }
}
