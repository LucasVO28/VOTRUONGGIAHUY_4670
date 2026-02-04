package lec08_objects_classes.constructor;

public class Student {
    int id;
    String name;
    int age;

    Student() {
        this(0, null, 0);
    }

    Student(int id, String name) {
        this(id, name, 0);
    }

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
